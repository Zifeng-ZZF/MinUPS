// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.erss.ups.proto.UPStoWorld;

public interface UFinishedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UFinished)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 truckid = 1;</code>
   * @return Whether the truckid field is set.
   */
  boolean hasTruckid();
  /**
   * <code>required int32 truckid = 1;</code>
   * @return The truckid.
   */
  int getTruckid();

  /**
   * <code>required int32 x = 2;</code>
   * @return Whether the x field is set.
   */
  boolean hasX();
  /**
   * <code>required int32 x = 2;</code>
   * @return The x.
   */
  int getX();

  /**
   * <code>required int32 y = 3;</code>
   * @return Whether the y field is set.
   */
  boolean hasY();
  /**
   * <code>required int32 y = 3;</code>
   * @return The y.
   */
  int getY();

  /**
   * <code>required string status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>required string status = 4;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>required string status = 4;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>required int64 seqnum = 5;</code>
   * @return Whether the seqnum field is set.
   */
  boolean hasSeqnum();
  /**
   * <code>required int64 seqnum = 5;</code>
   * @return The seqnum.
   */
  long getSeqnum();
}
