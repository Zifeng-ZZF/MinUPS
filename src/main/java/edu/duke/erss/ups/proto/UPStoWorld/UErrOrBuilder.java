// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.erss.ups.proto.UPStoWorld;

public interface UErrOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UErr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required string err = 1;</code>
   * @return Whether the err field is set.
   */
  boolean hasErr();
  /**
   * <code>required string err = 1;</code>
   * @return The err.
   */
  java.lang.String getErr();
  /**
   * <code>required string err = 1;</code>
   * @return The bytes for err.
   */
  com.google.protobuf.ByteString
      getErrBytes();

  /**
   * <code>required int64 originseqnum = 2;</code>
   * @return Whether the originseqnum field is set.
   */
  boolean hasOriginseqnum();
  /**
   * <code>required int64 originseqnum = 2;</code>
   * @return The originseqnum.
   */
  long getOriginseqnum();

  /**
   * <code>required int64 seqnum = 3;</code>
   * @return Whether the seqnum field is set.
   */
  boolean hasSeqnum();
  /**
   * <code>required int64 seqnum = 3;</code>
   * @return The seqnum.
   */
  long getSeqnum();
}
