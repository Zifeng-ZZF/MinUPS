// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_amazon.proto

package edu.duke.erss.ups.proto.AmazontoWorld;

public interface ACommandsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ACommands)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.AmazontoWorld.APurchaseMore> 
      getBuyList();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APurchaseMore getBuy(int index);
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  int getBuyCount();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.AmazontoWorld.APurchaseMoreOrBuilder> 
      getBuyOrBuilderList();
  /**
   * <code>repeated .APurchaseMore buy = 1;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APurchaseMoreOrBuilder getBuyOrBuilder(
      int index);

  /**
   * <code>repeated .APack topack = 2;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.AmazontoWorld.APack> 
      getTopackList();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APack getTopack(int index);
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  int getTopackCount();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.AmazontoWorld.APackOrBuilder> 
      getTopackOrBuilderList();
  /**
   * <code>repeated .APack topack = 2;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APackOrBuilder getTopackOrBuilder(
      int index);

  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.AmazontoWorld.APutOnTruck> 
      getLoadList();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APutOnTruck getLoad(int index);
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  int getLoadCount();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.AmazontoWorld.APutOnTruckOrBuilder> 
      getLoadOrBuilderList();
  /**
   * <code>repeated .APutOnTruck load = 3;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.APutOnTruckOrBuilder getLoadOrBuilder(
      int index);

  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.AmazontoWorld.AQuery> 
      getQueriesList();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.AQuery getQueries(int index);
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  int getQueriesCount();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.AmazontoWorld.AQueryOrBuilder> 
      getQueriesOrBuilderList();
  /**
   * <code>repeated .AQuery queries = 4;</code>
   */
  edu.duke.erss.ups.proto.AmazontoWorld.AQueryOrBuilder getQueriesOrBuilder(
      int index);

  /**
   * <code>optional uint32 simspeed = 5;</code>
   * @return Whether the simspeed field is set.
   */
  boolean hasSimspeed();
  /**
   * <code>optional uint32 simspeed = 5;</code>
   * @return The simspeed.
   */
  int getSimspeed();

  /**
   * <code>optional bool disconnect = 6;</code>
   * @return Whether the disconnect field is set.
   */
  boolean hasDisconnect();
  /**
   * <code>optional bool disconnect = 6;</code>
   * @return The disconnect.
   */
  boolean getDisconnect();

  /**
   * <code>repeated int64 acks = 7;</code>
   * @return A list containing the acks.
   */
  java.util.List<java.lang.Long> getAcksList();
  /**
   * <code>repeated int64 acks = 7;</code>
   * @return The count of acks.
   */
  int getAcksCount();
  /**
   * <code>repeated int64 acks = 7;</code>
   * @param index The index of the element to return.
   * @return The acks at the given index.
   */
  long getAcks(int index);
}
