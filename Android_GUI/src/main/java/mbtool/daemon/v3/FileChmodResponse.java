// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileChmodResponse extends Table {
  public static FileChmodResponse getRootAsFileChmodResponse(ByteBuffer _bb) { return getRootAsFileChmodResponse(_bb, new FileChmodResponse()); }
  public static FileChmodResponse getRootAsFileChmodResponse(ByteBuffer _bb, FileChmodResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FileChmodResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String errorMsg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer errorMsgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer errorMsgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public FileChmodError error() { return error(new FileChmodError()); }
  public FileChmodError error(FileChmodError obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFileChmodResponse(FlatBufferBuilder builder,
      boolean success,
      int error_msgOffset,
      int errorOffset) {
    builder.startObject(3);
    FileChmodResponse.addError(builder, errorOffset);
    FileChmodResponse.addErrorMsg(builder, error_msgOffset);
    FileChmodResponse.addSuccess(builder, success);
    return FileChmodResponse.endFileChmodResponse(builder);
  }

  public static void startFileChmodResponse(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addErrorMsg(FlatBufferBuilder builder, int errorMsgOffset) { builder.addOffset(1, errorMsgOffset, 0); }
  public static void addError(FlatBufferBuilder builder, int errorOffset) { builder.addOffset(2, errorOffset, 0); }
  public static int endFileChmodResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

