from collections import Counter
from pathlib import Path
import struct
import sys

from classfile import parse_class


OPCODES = {239: 4, 240: 183, 241: 180, 242: 179, 243: 178, 244: 43,
           245: 181, 246: 42, 247: 182, 248: 184}
LENGTHS = [1] * 202
for opcode in [16, 18, *range(21, 26), *range(54, 59), 169, 188]:
    LENGTHS[opcode] = 2
for opcode in [17, 19, 20, 132, *range(153, 169), *range(178, 185),
               187, 189, 192, 193, 198, 199]:
    LENGTHS[opcode] = 3
for opcode in [185, 186, 200, 201]:
    LENGTHS[opcode] = 5
LENGTHS[197] = 4


def instruction_length(code, position, opcode):
    if opcode in (170, 171):
        aligned = (position + 4) & ~3
        if opcode == 170:
            low, high = struct.unpack_from('>ii', code, aligned + 4)
            if high < low or high - low > len(code):
                raise ValueError('Invalid tableswitch')
            return aligned - position + 12 + (high - low + 1) * 4
        pairs = struct.unpack_from('>i', code, aligned + 4)[0]
        if pairs < 0 or pairs > len(code):
            raise ValueError('Invalid lookupswitch')
        return aligned - position + 8 + pairs * 8
    if opcode == 196:
        return 6 if code[position + 1] == 132 else 4
    if opcode >= len(LENGTHS):
        raise ValueError('Unknown opcode ' + str(opcode) + ' at ' + str(position))
    return LENGTHS[opcode]


def main():
    source = Path(sys.argv[1]) if len(sys.argv) > 1 else Path('work/archive-classes')
    output = Path(sys.argv[2]) if len(sys.argv) > 2 else Path('work/normalized-classes')
    count = Counter()
    failures = []
    total = 0
    for path in source.rglob('*.class'):
        data = bytearray(path.read_bytes())
        try:
            metadata = parse_class(data)
            if metadata['size'] != len(data):
                raise ValueError('Trailing class data')
            for name, offset, length in metadata['attribute_offsets']:
                if name != 'Code':
                    continue
                code_length = struct.unpack_from('>I', data, offset + 4)[0]
                begin = offset + 8
                code = data[begin:begin + code_length]
                position = 0
                while position < len(code):
                    opcode = code[position]
                    if opcode in OPCODES:
                        count[opcode] += 1
                        code[position] = OPCODES[opcode]
                        opcode = code[position]
                    position += instruction_length(code, position, opcode)
                if position != len(code):
                    raise ValueError('Misaligned instruction')
                data[begin:begin + code_length] = code
            target = output / path.relative_to(source)
            target.parent.mkdir(parents=True, exist_ok=True)
            target.write_bytes(data)
            total += 1
        except Exception as error:
            failures.append((str(path), str(error)))
    print('Normalized:', total, 'failures:', len(failures), 'opcode counts:', dict(count))
    print('Failure samples:', failures[:20])
    if failures:
        raise SystemExit(1)


if __name__ == '__main__':
    main()
