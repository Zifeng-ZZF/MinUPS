// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.erss.ups.proto.UPStoWorld;

public interface UConnectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UConnect)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 worldid = 1;</code>
   * @return Whether the worldid field is set.
   */
  boolean hasWorldid();
  /**
   * <code>optional int64 worldid = 1;</code>
   * @return The worldid.
   */
  long getWorldid();

  /**
   * <code>repeated .UInitTruck trucks = 2;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.UPStoWorld.UInitTruck> 
      getTrucksList();
  /**
   * <code>repeated .UInitTruck trucks = 2;</code>
   */
  edu.duke.erss.ups.proto.UPStoWorld.UInitTruck getTrucks(int index);
  /**
   * <code>repeated .UInitTruck trucks = 2;</code>
   */
  int getTrucksCount();
  /**
   * <code>repeated .UInitTruck trucks = 2;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.UPStoWorld.UInitTruckOrBuilder> 
      getTrucksOrBuilderList();
  /**
   * <code>repeated .UInitTruck trucks = 2;</code>
   */
  edu.duke.erss.ups.proto.UPStoWorld.UInitTruckOrBuilder getTrucksOrBuilder(
      int index);

  /**
   * <code>required bool isAmazon = 3;</code>
   * @return Whether the isAmazon field is set.
   */
  boolean hasIsAmazon();
  /**
   * <code>required bool isAmazon = 3;</code>
   * @return The isAmazon.
   */
  boolean getIsAmazon();
}
