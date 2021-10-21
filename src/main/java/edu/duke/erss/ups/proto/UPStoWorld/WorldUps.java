// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.erss.ups.proto.UPStoWorld;

public final class WorldUps {
  private WorldUps() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UInitTruck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UInitTruck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UConnect_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UConnect_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UConnected_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UConnected_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UGoPickup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UGoPickup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UFinished_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UFinished_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UDeliveryMade_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UDeliveryMade_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UDeliveryLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UDeliveryLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UGoDeliver_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UGoDeliver_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UErr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UErr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UTruck_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UTruck_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UCommands_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UCommands_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UResponses_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UResponses_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017world_ups.proto\".\n\nUInitTruck\022\n\n\002id\030\001 " +
      "\002(\005\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\"J\n\010UConnect\022\017\n" +
      "\007worldid\030\001 \001(\003\022\033\n\006trucks\030\002 \003(\0132\013.UInitTr" +
      "uck\022\020\n\010isAmazon\030\003 \002(\010\"-\n\nUConnected\022\017\n\007w" +
      "orldid\030\001 \002(\003\022\016\n\006result\030\002 \002(\t\":\n\tUGoPicku" +
      "p\022\017\n\007truckid\030\001 \002(\005\022\014\n\004whid\030\002 \002(\005\022\016\n\006seqn" +
      "um\030\003 \002(\003\"R\n\tUFinished\022\017\n\007truckid\030\001 \002(\005\022\t" +
      "\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\022\016\n\006status\030\004 \002(\t\022\016\n\006" +
      "seqnum\030\005 \002(\003\"C\n\rUDeliveryMade\022\017\n\007truckid" +
      "\030\001 \002(\005\022\021\n\tpackageid\030\002 \002(\003\022\016\n\006seqnum\030\003 \002(" +
      "\003\"<\n\021UDeliveryLocation\022\021\n\tpackageid\030\001 \002(" +
      "\003\022\t\n\001x\030\002 \002(\005\022\t\n\001y\030\003 \002(\005\"S\n\nUGoDeliver\022\017\n" +
      "\007truckid\030\001 \002(\005\022$\n\010packages\030\002 \003(\0132\022.UDeli" +
      "veryLocation\022\016\n\006seqnum\030\003 \002(\003\"9\n\004UErr\022\013\n\003" +
      "err\030\001 \002(\t\022\024\n\014originseqnum\030\002 \002(\003\022\016\n\006seqnu" +
      "m\030\003 \002(\003\")\n\006UQuery\022\017\n\007truckid\030\001 \002(\005\022\016\n\006se" +
      "qnum\030\002 \002(\003\"O\n\006UTruck\022\017\n\007truckid\030\001 \002(\005\022\016\n" +
      "\006status\030\002 \002(\t\022\t\n\001x\030\003 \002(\005\022\t\n\001y\030\004 \002(\005\022\016\n\006s" +
      "eqnum\030\005 \002(\003\"\227\001\n\tUCommands\022\033\n\007pickups\030\001 \003" +
      "(\0132\n.UGoPickup\022\037\n\ndeliveries\030\002 \003(\0132\013.UGo" +
      "Deliver\022\020\n\010simspeed\030\003 \001(\r\022\022\n\ndisconnect\030" +
      "\004 \001(\010\022\030\n\007queries\030\005 \003(\0132\007.UQuery\022\014\n\004acks\030" +
      "\006 \003(\003\"\244\001\n\nUResponses\022\037\n\013completions\030\001 \003(" +
      "\0132\n.UFinished\022!\n\tdelivered\030\002 \003(\0132\016.UDeli" +
      "veryMade\022\020\n\010finished\030\003 \001(\010\022\014\n\004acks\030\004 \003(\003" +
      "\022\034\n\013truckstatus\030\005 \003(\0132\007.UTruck\022\024\n\005error\030" +
      "\006 \003(\0132\005.UErrB(\n\"edu.duke.erss.ups.proto." +
      "UPStoWorldH\002P\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UInitTruck_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UInitTruck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UInitTruck_descriptor,
        new java.lang.String[] { "Id", "X", "Y", });
    internal_static_UConnect_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UConnect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UConnect_descriptor,
        new java.lang.String[] { "Worldid", "Trucks", "IsAmazon", });
    internal_static_UConnected_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UConnected_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UConnected_descriptor,
        new java.lang.String[] { "Worldid", "Result", });
    internal_static_UGoPickup_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UGoPickup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UGoPickup_descriptor,
        new java.lang.String[] { "Truckid", "Whid", "Seqnum", });
    internal_static_UFinished_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UFinished_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UFinished_descriptor,
        new java.lang.String[] { "Truckid", "X", "Y", "Status", "Seqnum", });
    internal_static_UDeliveryMade_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_UDeliveryMade_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UDeliveryMade_descriptor,
        new java.lang.String[] { "Truckid", "Packageid", "Seqnum", });
    internal_static_UDeliveryLocation_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_UDeliveryLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UDeliveryLocation_descriptor,
        new java.lang.String[] { "Packageid", "X", "Y", });
    internal_static_UGoDeliver_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_UGoDeliver_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UGoDeliver_descriptor,
        new java.lang.String[] { "Truckid", "Packages", "Seqnum", });
    internal_static_UErr_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_UErr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UErr_descriptor,
        new java.lang.String[] { "Err", "Originseqnum", "Seqnum", });
    internal_static_UQuery_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_UQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UQuery_descriptor,
        new java.lang.String[] { "Truckid", "Seqnum", });
    internal_static_UTruck_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_UTruck_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UTruck_descriptor,
        new java.lang.String[] { "Truckid", "Status", "X", "Y", "Seqnum", });
    internal_static_UCommands_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_UCommands_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UCommands_descriptor,
        new java.lang.String[] { "Pickups", "Deliveries", "Simspeed", "Disconnect", "Queries", "Acks", });
    internal_static_UResponses_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_UResponses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UResponses_descriptor,
        new java.lang.String[] { "Completions", "Delivered", "Finished", "Acks", "Truckstatus", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}