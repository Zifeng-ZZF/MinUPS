// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.erss.ups.proto.UPStoAmazon;

public interface UAResponsesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.UAResponses)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tutorial.UPSTruckArrive arrive = 1;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.UPSTruckArrive> 
      getArriveList();
  /**
   * <code>repeated .tutorial.UPSTruckArrive arrive = 1;</code>
   */
  edu.duke.erss.ups.proto.UPStoAmazon.UPSTruckArrive getArrive(int index);
  /**
   * <code>repeated .tutorial.UPSTruckArrive arrive = 1;</code>
   */
  int getArriveCount();
  /**
   * <code>repeated .tutorial.UPSTruckArrive arrive = 1;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.UPSTruckArriveOrBuilder> 
      getArriveOrBuilderList();
  /**
   * <code>repeated .tutorial.UPSTruckArrive arrive = 1;</code>
   */
  edu.duke.erss.ups.proto.UPStoAmazon.UPSTruckArriveOrBuilder getArriveOrBuilder(
      int index);

  /**
   * <code>repeated .tutorial.UPSDelivered deliver = 2;</code>
   */
  java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered> 
      getDeliverList();
  /**
   * <code>repeated .tutorial.UPSDelivered deliver = 2;</code>
   */
  edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered getDeliver(int index);
  /**
   * <code>repeated .tutorial.UPSDelivered deliver = 2;</code>
   */
  int getDeliverCount();
  /**
   * <code>repeated .tutorial.UPSDelivered deliver = 2;</code>
   */
  java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.UPSDeliveredOrBuilder> 
      getDeliverOrBuilderList();
  /**
   * <code>repeated .tutorial.UPSDelivered deliver = 2;</code>
   */
  edu.duke.erss.ups.proto.UPStoAmazon.UPSDeliveredOrBuilder getDeliverOrBuilder(
      int index);

  /**
   * <code>repeated int64 acks = 3;</code>
   * @return A list containing the acks.
   */
  java.util.List<java.lang.Long> getAcksList();
  /**
   * <code>repeated int64 acks = 3;</code>
   * @return The count of acks.
   */
  int getAcksCount();
  /**
   * <code>repeated int64 acks = 3;</code>
   * @param index The index of the element to return.
   * @return The acks at the given index.
   */
  long getAcks(int index);
}