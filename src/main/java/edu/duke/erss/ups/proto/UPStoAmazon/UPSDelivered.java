// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.erss.ups.proto.UPStoAmazon;

/**
 * Protobuf type {@code tutorial.UPSDelivered}
 */
public final class UPSDelivered extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.UPSDelivered)
    UPSDeliveredOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UPSDelivered.newBuilder() to construct.
  private UPSDelivered(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UPSDelivered() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UPSDelivered();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UPSDelivered_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UPSDelivered_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.class, edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.Builder.class);
  }

  private int bitField0_;
  public static final int SHIPID_FIELD_NUMBER = 1;
  private long shipid_;
  /**
   * <code>required int64 shipid = 1;</code>
   * @return Whether the shipid field is set.
   */
  @java.lang.Override
  public boolean hasShipid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int64 shipid = 1;</code>
   * @return The shipid.
   */
  @java.lang.Override
  public long getShipid() {
    return shipid_;
  }

  public static final int SEQ_FIELD_NUMBER = 2;
  private long seq_;
  /**
   * <code>required int64 seq = 2;</code>
   * @return Whether the seq field is set.
   */
  @java.lang.Override
  public boolean hasSeq() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>required int64 seq = 2;</code>
   * @return The seq.
   */
  @java.lang.Override
  public long getSeq() {
    return seq_;
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered parseFrom(
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
  public static Builder newBuilder(edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered prototype) {
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
   * Protobuf type {@code tutorial.UPSDelivered}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.UPSDelivered)
      edu.duke.erss.ups.proto.UPStoAmazon.UPSDeliveredOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UPSDelivered_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UPSDelivered_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.class, edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.Builder.class);
    }

    // Construct using edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.newBuilder()
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
      shipid_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      seq_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UPSDelivered_descriptor;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered getDefaultInstanceForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered build() {
      edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered buildPartial() {
      edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered result = new edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shipid_ = shipid_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seq_ = seq_;
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

    private long shipid_ ;
    /**
     * <code>required int64 shipid = 1;</code>
     * @return Whether the shipid field is set.
     */
    @java.lang.Override
    public boolean hasShipid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 shipid = 1;</code>
     * @return The shipid.
     */
    @java.lang.Override
    public long getShipid() {
      return shipid_;
    }
    /**
     * <code>required int64 shipid = 1;</code>
     * @param value The shipid to set.
     * @return This builder for chaining.
     */
    public Builder setShipid(long value) {
      bitField0_ |= 0x00000001;
      shipid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 shipid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearShipid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shipid_ = 0L;
      onChanged();
      return this;
    }

    private long seq_ ;
    /**
     * <code>required int64 seq = 2;</code>
     * @return Whether the seq field is set.
     */
    @java.lang.Override
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required int64 seq = 2;</code>
     * @return The seq.
     */
    @java.lang.Override
    public long getSeq() {
      return seq_;
    }
    /**
     * <code>required int64 seq = 2;</code>
     * @param value The seq to set.
     * @return This builder for chaining.
     */
    public Builder setSeq(long value) {
      bitField0_ |= 0x00000002;
      seq_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 seq = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeq() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seq_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tutorial.UPSDelivered)
  }

  // @@protoc_insertion_point(class_scope:tutorial.UPSDelivered)
  private static final edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered();
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UPSDelivered>
      PARSER = new com.google.protobuf.AbstractParser<UPSDelivered>() {
    @java.lang.Override
    public UPSDelivered parsePartialFrom(
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

  public static com.google.protobuf.Parser<UPSDelivered> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UPSDelivered> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.UPSDelivered getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
