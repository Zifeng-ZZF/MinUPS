// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: world_ups.proto

package edu.duke.erss.ups.proto.UPStoWorld;

/**
 * Protobuf type {@code UQuery}
 */
public final class UQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UQuery)
    UQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UQuery.newBuilder() to construct.
  private UQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UQuery() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UQuery();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.erss.ups.proto.UPStoWorld.WorldUps.internal_static_UQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.erss.ups.proto.UPStoWorld.WorldUps.internal_static_UQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.erss.ups.proto.UPStoWorld.UQuery.class, edu.duke.erss.ups.proto.UPStoWorld.UQuery.Builder.class);
  }

  private int bitField0_;
  public static final int TRUCKID_FIELD_NUMBER = 1;
  private int truckid_;
  /**
   * <code>required int32 truckid = 1;</code>
   * @return Whether the truckid field is set.
   */
  @java.lang.Override
  public boolean hasTruckid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int32 truckid = 1;</code>
   * @return The truckid.
   */
  @java.lang.Override
  public int getTruckid() {
    return truckid_;
  }

  public static final int SEQNUM_FIELD_NUMBER = 2;
  private long seqnum_;
  /**
   * <code>required int64 seqnum = 2;</code>
   * @return Whether the seqnum field is set.
   */
  @java.lang.Override
  public boolean hasSeqnum() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int64 seqnum = 2;</code>
   * @return The seqnum.
   */
  @java.lang.Override
  public long getSeqnum() {
    return seqnum_;
  }

  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(edu.duke.erss.ups.proto.UPStoWorld.UQuery prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UQuery)
      edu.duke.erss.ups.proto.UPStoWorld.UQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.erss.ups.proto.UPStoWorld.WorldUps.internal_static_UQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.erss.ups.proto.UPStoWorld.WorldUps.internal_static_UQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.erss.ups.proto.UPStoWorld.UQuery.class, edu.duke.erss.ups.proto.UPStoWorld.UQuery.Builder.class);
    }

    // Construct using edu.duke.erss.ups.proto.UPStoWorld.UQuery.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      truckid_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      seqnum_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.erss.ups.proto.UPStoWorld.WorldUps.internal_static_UQuery_descriptor;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoWorld.UQuery getDefaultInstanceForType() {
      return edu.duke.erss.ups.proto.UPStoWorld.UQuery.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoWorld.UQuery build() {
      edu.duke.erss.ups.proto.UPStoWorld.UQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoWorld.UQuery buildPartial() {
      edu.duke.erss.ups.proto.UPStoWorld.UQuery result = new edu.duke.erss.ups.proto.UPStoWorld.UQuery(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.truckid_ = truckid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seqnum_ = seqnum_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private int truckid_ ;
    /**
     * <code>required int32 truckid = 1;</code>
     * @return Whether the truckid field is set.
     */
    @java.lang.Override
    public boolean hasTruckid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @return The truckid.
     */
    @java.lang.Override
    public int getTruckid() {
      return truckid_;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @param value The truckid to set.
     * @return This builder for chaining.
     */
    public Builder setTruckid(int value) {
      bitField0_ |= 0x00000001;
      truckid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int32 truckid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTruckid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      truckid_ = 0;
      onChanged();
      return this;
    }

    private long seqnum_ ;
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return Whether the seqnum field is set.
     */
    @java.lang.Override
    public boolean hasSeqnum() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return The seqnum.
     */
    @java.lang.Override
    public long getSeqnum() {
      return seqnum_;
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @param value The seqnum to set.
     * @return This builder for chaining.
     */
    public Builder setSeqnum(long value) {
      bitField0_ |= 0x00000002;
      seqnum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 seqnum = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqnum() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seqnum_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:UQuery)
  }

  // @@protoc_insertion_point(class_scope:UQuery)
  private static final edu.duke.erss.ups.proto.UPStoWorld.UQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.erss.ups.proto.UPStoWorld.UQuery();
  }

  public static edu.duke.erss.ups.proto.UPStoWorld.UQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UQuery>
      PARSER = new com.google.protobuf.AbstractParser<UQuery>() {
    @java.lang.Override
    public UQuery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoWorld.UQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
