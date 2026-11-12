import struct


class Reader:
    def __init__(self, data):
        self.data = data
        self.position = 0

    def take(self, length):
        end = self.position + length
        if length < 0 or end > len(self.data):
            raise ValueError('Truncated class file')
        result = self.data[self.position:end]
        self.position = end
        return result

    def u1(self):
        return self.take(1)[0]

    def u2(self):
        return struct.unpack('>H', self.take(2))[0]

    def u4(self):
        return struct.unpack('>I', self.take(4))[0]


def parse_class(data):
    reader = Reader(data)
    if reader.u4() != 0xcafebabe:
        raise ValueError('Invalid magic')
    minor, major = reader.u2(), reader.u2()
    if not 45 <= major <= 70:
        raise ValueError('Invalid version')
    pool = [None] * reader.u2()
    index = 1
    while index < len(pool):
        tag = reader.u1()
        if tag == 1:
            pool[index] = (tag, reader.take(reader.u2()).decode('utf-8', errors='replace'))
        elif tag in (7, 8, 16, 19, 20):
            pool[index] = (tag, reader.u2())
        elif tag in (3, 4):
            pool[index] = (tag, reader.take(4))
        elif tag in (5, 6):
            pool[index] = (tag, reader.take(8))
            index += 1
        elif tag in (9, 10, 11, 12, 17, 18):
            pool[index] = (tag, reader.u2(), reader.u2())
        elif tag == 15:
            pool[index] = (tag, reader.u1(), reader.u2())
        else:
            raise ValueError('Invalid constant pool tag')
        index += 1

    def utf(index):
        return pool[index][1]

    def classname(index):
        return utf(pool[index][1]) if index else None

    attribute_offsets = []

    def attributes():
        result = []
        for _ in range(reader.u2()):
            name, length = utf(reader.u2()), reader.u4()
            attribute_offsets.append((name, reader.position, length))
            result.append((name, reader.take(length)))
        return result

    access, this, parent = reader.u2(), reader.u2(), reader.u2()
    interfaces = [classname(reader.u2()) for _ in range(reader.u2())]

    def members():
        result = []
        for _ in range(reader.u2()):
            flags, name, descriptor = reader.u2(), utf(reader.u2()), utf(reader.u2())
            attrs = attributes()
            result.append({'access': flags, 'name': name, 'descriptor': descriptor,
                           'attributes': attrs})
        return result

    fields, methods = members(), members()
    attrs = attributes()
    name = classname(this)
    if not isinstance(name, str) or not name or any(c in name for c in '\x00.\\:'):
        raise ValueError('Invalid class name')
    return {'name': name, 'super': classname(parent), 'interfaces': interfaces,
            'access': access, 'major': major, 'minor': minor, 'size': reader.position,
            'fields': fields, 'methods': methods, 'attributes': attrs, 'pool': pool,
            'attribute_offsets': attribute_offsets,
            'strings': [utf(item[1]) for item in pool if item and item[0] == 8]}


def annotations(metadata):
    pool = metadata['pool']

    def utf(index):
        return pool[index][1]

    def value(reader):
        tag = chr(reader.u1())
        if tag == 's':
            return utf(reader.u2())
        if tag in 'BCDFIJSZ':
            item = pool[reader.u2()]
            formats = {3: '>i', 4: '>f', 5: '>q', 6: '>d'}
            result = struct.unpack(formats[item[0]], item[1])[0]
            return bool(result) if tag == 'Z' else result
        if tag == 'e':
            return {'type': utf(reader.u2()), 'value': utf(reader.u2())}
        if tag == 'c':
            return utf(reader.u2())
        if tag == '@':
            return annotation(reader)
        if tag == '[':
            return [value(reader) for _ in range(reader.u2())]
        raise ValueError('Invalid annotation value')

    def annotation(reader):
        descriptor = utf(reader.u2())
        values = {}
        for _ in range(reader.u2()):
            name = utf(reader.u2())
            values[name] = value(reader)
        return {'type': descriptor, 'values': values}

    result = []
    for name, data in metadata['attributes']:
        if name in ('RuntimeVisibleAnnotations', 'RuntimeInvisibleAnnotations'):
            reader = Reader(data)
            result.extend(annotation(reader) for _ in range(reader.u2()))
    return result
