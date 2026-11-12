/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.buffer.ByteBufProcessor
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 */
package net.minecraft.network;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.ByteBufProcessor;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;
import net.minecraft.item.co;
import net.minecraft.item.d;
import net.minecraft.nbt.a;
import net.minecraft.nbt.j;
import net.minecraft.nbt.n;
import net.minecraft.util.b;
import net.minecraft.util.ba;
import net.minecraft.util.bb;

public class ak
extends ByteBuf {
    private final ByteBuf das;

    public ak(ByteBuf byteBuf) {
        this.das = byteBuf;
    }

    public static int gq(int n2) {
        for (int i2 = 1; i2 < 5; ++i2) {
            if ((n2 & -1 << i2 * 7) != 0) continue;
            return i2;
        }
        return 5;
    }

    public void k(byte[] byArray) {
        this.gr(byArray.length);
        this.writeBytes(byArray);
    }

    public byte[] aft() {
        byte[] byArray = new byte[this.afw()];
        this.readBytes(byArray);
        return byArray;
    }

    public b afu() {
        return b.x(this.readLong());
    }

    public void ak(b b2) {
        this.writeLong(b2.ard());
    }

    public ba afv() {
        return bb.gi(this.gs(Short.MAX_VALUE));
    }

    public void j(ba ba2) {
        this.eS(bb.q(ba2));
    }

    public <T extends Enum<T>> T k(Class<T> clazz) {
        return (T)((Enum[])clazz.getEnumConstants())[this.afw()];
    }

    public void b(Enum<?> enum_) {
        this.gr(enum_.ordinal());
    }

    public int afw() {
        byte by2;
        int n2 = 0;
        int n3 = 0;
        do {
            by2 = this.readByte();
            n2 |= (by2 & 0x7F) << n3++ * 7;
            if (n3 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by2 & 0x80) == 128);
        return n2;
    }

    public long afx() {
        byte by2;
        long l2 = 0L;
        int n2 = 0;
        do {
            by2 = this.readByte();
            l2 |= (long)(by2 & 0x7F) << n2++ * 7;
            if (n2 <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while ((by2 & 0x80) == 128);
        return l2;
    }

    public void i(UUID uUID) {
        this.writeLong(uUID.getMostSignificantBits());
        this.writeLong(uUID.getLeastSignificantBits());
    }

    public UUID afy() {
        return new UUID(this.readLong(), this.readLong());
    }

    public void gr(int n2) {
        while ((n2 & 0xFFFFFF80) != 0) {
            this.writeByte(n2 & 0x7F | 0x80);
            n2 >>>= 7;
        }
        this.writeByte(n2);
    }

    public void w(long l2) {
        while ((l2 & 0xFFFFFFFFFFFFFF80L) != 0L) {
            this.writeByte((int)(l2 & 0x7FL) | 0x80);
            l2 >>>= 7;
        }
        this.writeByte((int)l2);
    }

    public void y(n n2) {
        if (n2 == null) {
            this.writeByte(0);
        } else {
            try {
                a.a(n2, (DataOutput)new ByteBufOutputStream((ByteBuf)this));
            }
            catch (IOException iOException) {
                throw new EncoderException((Throwable)iOException);
            }
        }
    }

    public n afz() {
        int n2 = this.readerIndex();
        byte by2 = this.readByte();
        if (by2 == 0) {
            return null;
        }
        this.readerIndex(n2);
        return a.a((DataInput)new ByteBufInputStream((ByteBuf)this), new j(0x200000L));
    }

    public void aO(co co2) {
        if (co2 == null) {
            this.writeShort(-1);
        } else {
            this.writeShort(d.p(co2.bP()));
            this.writeByte(co2.cWZ);
            this.writeShort(co2.yc());
            n n2 = null;
            if (co2.bP().adu() || co2.bP().ady()) {
                n2 = co2.aek();
            }
            this.y(n2);
        }
    }

    public co afA() {
        co co2 = null;
        short s2 = this.readShort();
        if (s2 >= 0) {
            byte by2 = this.readByte();
            short s3 = this.readShort();
            co2 = new co(d.fT(s2), (int)by2, (int)s3);
            co2.u(this.afz());
        }
        return co2;
    }

    public String gs(int n2) {
        int n3 = this.afw();
        if (n3 > n2 * 4) {
            throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + n3 + " > " + n2 * 4 + ")");
        }
        if (n3 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.readBytes(n3).array(), Charsets.UTF_8);
        if (string.length() > n2) {
            throw new DecoderException("The received string length is longer than maximum allowed (" + n3 + " > " + n2 + ")");
        }
        return string;
    }

    public ak eS(String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        if (byArray.length > Short.MAX_VALUE) {
            throw new EncoderException("String too big (was " + string.length() + " bytes encoded, max 32767)");
        }
        this.gr(byArray.length);
        this.writeBytes(byArray);
        return this;
    }

    public int capacity() {
        return this.das.capacity();
    }

    public ByteBuf capacity(int n2) {
        return this.das.capacity(n2);
    }

    public int maxCapacity() {
        return this.das.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.das.alloc();
    }

    public ByteOrder order() {
        return this.das.order();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.das.order(byteOrder);
    }

    public ByteBuf unwrap() {
        return this.das.unwrap();
    }

    public boolean isDirect() {
        return this.das.isDirect();
    }

    public int readerIndex() {
        return this.das.readerIndex();
    }

    public ByteBuf readerIndex(int n2) {
        return this.das.readerIndex(n2);
    }

    public int writerIndex() {
        return this.das.writerIndex();
    }

    public ByteBuf writerIndex(int n2) {
        return this.das.writerIndex(n2);
    }

    public ByteBuf setIndex(int n2, int n3) {
        return this.das.setIndex(n2, n3);
    }

    public int readableBytes() {
        return this.das.readableBytes();
    }

    public int writableBytes() {
        return this.das.writableBytes();
    }

    public int maxWritableBytes() {
        return this.das.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.das.isReadable();
    }

    public boolean isReadable(int n2) {
        return this.das.isReadable(n2);
    }

    public boolean isWritable() {
        return this.das.isWritable();
    }

    public boolean isWritable(int n2) {
        return this.das.isWritable(n2);
    }

    public ByteBuf clear() {
        return this.das.clear();
    }

    public ByteBuf markReaderIndex() {
        return this.das.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.das.resetReaderIndex();
    }

    public ByteBuf markWriterIndex() {
        return this.das.markWriterIndex();
    }

    public ByteBuf resetWriterIndex() {
        return this.das.resetWriterIndex();
    }

    public ByteBuf discardReadBytes() {
        return this.das.discardReadBytes();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.das.discardSomeReadBytes();
    }

    public ByteBuf ensureWritable(int n2) {
        return this.das.ensureWritable(n2);
    }

    public int ensureWritable(int n2, boolean bl2) {
        return this.das.ensureWritable(n2, bl2);
    }

    public boolean getBoolean(int n2) {
        return this.das.getBoolean(n2);
    }

    public byte getByte(int n2) {
        return this.das.getByte(n2);
    }

    public short getUnsignedByte(int n2) {
        return this.das.getUnsignedByte(n2);
    }

    public short getShort(int n2) {
        return this.das.getShort(n2);
    }

    public int getUnsignedShort(int n2) {
        return this.das.getUnsignedShort(n2);
    }

    public int getMedium(int n2) {
        return this.das.getMedium(n2);
    }

    public int getUnsignedMedium(int n2) {
        return this.das.getUnsignedMedium(n2);
    }

    public int getInt(int n2) {
        return this.das.getInt(n2);
    }

    public long getUnsignedInt(int n2) {
        return this.das.getUnsignedInt(n2);
    }

    public long getLong(int n2) {
        return this.das.getLong(n2);
    }

    public char getChar(int n2) {
        return this.das.getChar(n2);
    }

    public float getFloat(int n2) {
        return this.das.getFloat(n2);
    }

    public double getDouble(int n2) {
        return this.das.getDouble(n2);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf) {
        return this.das.getBytes(n2, byteBuf);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.das.getBytes(n2, byteBuf, n3);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.das.getBytes(n2, byteBuf, n3, n4);
    }

    public ByteBuf getBytes(int n2, byte[] byArray) {
        return this.das.getBytes(n2, byArray);
    }

    public ByteBuf getBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.das.getBytes(n2, byArray, n3, n4);
    }

    public ByteBuf getBytes(int n2, ByteBuffer byteBuffer) {
        return this.das.getBytes(n2, byteBuffer);
    }

    public ByteBuf getBytes(int n2, OutputStream outputStream, int n3) {
        return this.das.getBytes(n2, outputStream, n3);
    }

    public int getBytes(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.das.getBytes(n2, gatheringByteChannel, n3);
    }

    public ByteBuf setBoolean(int n2, boolean bl2) {
        return this.das.setBoolean(n2, bl2);
    }

    public ByteBuf setByte(int n2, int n3) {
        return this.das.setByte(n2, n3);
    }

    public ByteBuf setShort(int n2, int n3) {
        return this.das.setShort(n2, n3);
    }

    public ByteBuf setMedium(int n2, int n3) {
        return this.das.setMedium(n2, n3);
    }

    public ByteBuf setInt(int n2, int n3) {
        return this.das.setInt(n2, n3);
    }

    public ByteBuf setLong(int n2, long l2) {
        return this.das.setLong(n2, l2);
    }

    public ByteBuf setChar(int n2, int n3) {
        return this.das.setChar(n2, n3);
    }

    public ByteBuf setFloat(int n2, float f2) {
        return this.das.setFloat(n2, f2);
    }

    public ByteBuf setDouble(int n2, double d2) {
        return this.das.setDouble(n2, d2);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf) {
        return this.das.setBytes(n2, byteBuf);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.das.setBytes(n2, byteBuf, n3);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.das.setBytes(n2, byteBuf, n3, n4);
    }

    public ByteBuf setBytes(int n2, byte[] byArray) {
        return this.das.setBytes(n2, byArray);
    }

    public ByteBuf setBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.das.setBytes(n2, byArray, n3, n4);
    }

    public ByteBuf setBytes(int n2, ByteBuffer byteBuffer) {
        return this.das.setBytes(n2, byteBuffer);
    }

    public int setBytes(int n2, InputStream inputStream, int n3) {
        return this.das.setBytes(n2, inputStream, n3);
    }

    public int setBytes(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        return this.das.setBytes(n2, scatteringByteChannel, n3);
    }

    public ByteBuf setZero(int n2, int n3) {
        return this.das.setZero(n2, n3);
    }

    public boolean readBoolean() {
        return this.das.readBoolean();
    }

    public byte readByte() {
        return this.das.readByte();
    }

    public short readUnsignedByte() {
        return this.das.readUnsignedByte();
    }

    public short readShort() {
        return this.das.readShort();
    }

    public int readUnsignedShort() {
        return this.das.readUnsignedShort();
    }

    public int readMedium() {
        return this.das.readMedium();
    }

    public int readUnsignedMedium() {
        return this.das.readUnsignedMedium();
    }

    public int readInt() {
        return this.das.readInt();
    }

    public long readUnsignedInt() {
        return this.das.readUnsignedInt();
    }

    public long readLong() {
        return this.das.readLong();
    }

    public char readChar() {
        return this.das.readChar();
    }

    public float readFloat() {
        return this.das.readFloat();
    }

    public double readDouble() {
        return this.das.readDouble();
    }

    public ByteBuf readBytes(int n2) {
        return this.das.readBytes(n2);
    }

    public ByteBuf readSlice(int n2) {
        return this.das.readSlice(n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.das.readBytes(byteBuf);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2) {
        return this.das.readBytes(byteBuf, n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.das.readBytes(byteBuf, n2, n3);
    }

    public ByteBuf readBytes(byte[] byArray) {
        return this.das.readBytes(byArray);
    }

    public ByteBuf readBytes(byte[] byArray, int n2, int n3) {
        return this.das.readBytes(byArray, n2, n3);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.das.readBytes(byteBuffer);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n2) {
        return this.das.readBytes(outputStream, n2);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n2) {
        return this.das.readBytes(gatheringByteChannel, n2);
    }

    public ByteBuf skipBytes(int n2) {
        return this.das.skipBytes(n2);
    }

    public ByteBuf writeBoolean(boolean bl2) {
        return this.das.writeBoolean(bl2);
    }

    public ByteBuf writeByte(int n2) {
        return this.das.writeByte(n2);
    }

    public ByteBuf writeShort(int n2) {
        return this.das.writeShort(n2);
    }

    public ByteBuf writeMedium(int n2) {
        return this.das.writeMedium(n2);
    }

    public ByteBuf writeInt(int n2) {
        return this.das.writeInt(n2);
    }

    public ByteBuf writeLong(long l2) {
        return this.das.writeLong(l2);
    }

    public ByteBuf writeChar(int n2) {
        return this.das.writeChar(n2);
    }

    public ByteBuf writeFloat(float f2) {
        return this.das.writeFloat(f2);
    }

    public ByteBuf writeDouble(double d2) {
        return this.das.writeDouble(d2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.das.writeBytes(byteBuf);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2) {
        return this.das.writeBytes(byteBuf, n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.das.writeBytes(byteBuf, n2, n3);
    }

    public ByteBuf writeBytes(byte[] byArray) {
        return this.das.writeBytes(byArray);
    }

    public ByteBuf writeBytes(byte[] byArray, int n2, int n3) {
        return this.das.writeBytes(byArray, n2, n3);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.das.writeBytes(byteBuffer);
    }

    public int writeBytes(InputStream inputStream, int n2) {
        return this.das.writeBytes(inputStream, n2);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.das.writeBytes(scatteringByteChannel, n2);
    }

    public ByteBuf writeZero(int n2) {
        return this.das.writeZero(n2);
    }

    public int indexOf(int n2, int n3, byte by2) {
        return this.das.indexOf(n2, n3, by2);
    }

    public int bytesBefore(byte by2) {
        return this.das.bytesBefore(by2);
    }

    public int bytesBefore(int n2, byte by2) {
        return this.das.bytesBefore(n2, by2);
    }

    public int bytesBefore(int n2, int n3, byte by2) {
        return this.das.bytesBefore(n2, n3, by2);
    }

    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        return this.das.forEachByte(byteBufProcessor);
    }

    public int forEachByte(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        return this.das.forEachByte(n2, n3, byteBufProcessor);
    }

    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        return this.das.forEachByteDesc(byteBufProcessor);
    }

    public int forEachByteDesc(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        return this.das.forEachByteDesc(n2, n3, byteBufProcessor);
    }

    public ByteBuf copy() {
        return this.das.copy();
    }

    public ByteBuf copy(int n2, int n3) {
        return this.das.copy(n2, n3);
    }

    public ByteBuf slice() {
        return this.das.slice();
    }

    public ByteBuf slice(int n2, int n3) {
        return this.das.slice(n2, n3);
    }

    public ByteBuf duplicate() {
        return this.das.duplicate();
    }

    public int nioBufferCount() {
        return this.das.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.das.nioBuffer();
    }

    public ByteBuffer nioBuffer(int n2, int n3) {
        return this.das.nioBuffer(n2, n3);
    }

    public ByteBuffer internalNioBuffer(int n2, int n3) {
        return this.das.internalNioBuffer(n2, n3);
    }

    public ByteBuffer[] nioBuffers() {
        return this.das.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int n2, int n3) {
        return this.das.nioBuffers(n2, n3);
    }

    public boolean hasArray() {
        return this.das.hasArray();
    }

    public byte[] array() {
        return this.das.array();
    }

    public int arrayOffset() {
        return this.das.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.das.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.das.memoryAddress();
    }

    public String toString(Charset charset) {
        return this.das.toString(charset);
    }

    public String toString(int n2, int n3, Charset charset) {
        return this.das.toString(n2, n3, charset);
    }

    public int hashCode() {
        return this.das.hashCode();
    }

    public boolean equals(Object object) {
        return this.das.equals(object);
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.das.compareTo(byteBuf);
    }

    public String toString() {
        return this.das.toString();
    }

    public ByteBuf retain(int n2) {
        return this.das.retain(n2);
    }

    public ByteBuf retain() {
        return this.das.retain();
    }

    public int refCnt() {
        return this.das.refCnt();
    }

    public boolean release() {
        return this.das.release();
    }

    public boolean release(int n2) {
        return this.das.release(n2);
    }
}

