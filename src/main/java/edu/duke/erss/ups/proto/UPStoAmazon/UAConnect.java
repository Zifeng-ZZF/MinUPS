// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.erss.ups.proto.UPStoAmazon;

/**
 * Protobuf type {@code tutorial.UAConnect}
 */
public final class UAConnect extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.UAConnect)
    UAConnectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UAConnect.newBuilder() to construct.
  private UAConnect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UAConnect() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UAConnect();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UAConnect_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UAConnect_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.class, edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.Builder.class);
  }

  private int bitField0_;
  public static final int WORLDID_FIELD_NUMBER = 1;
  private long worldid_;
  /**
   * <code>required int64 worldid = 1;</code>
   * @return Whether the worldid field is set.
   */
  @java.lang.Override
  public boolean hasWorldid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>required int64 worldid = 1;</code>
   * @return The worldid.
   */
  @java.lang.Override
  public long getWorldid() {
    return worldid_;
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect parseFrom(
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
  public static Builder newBuilder(edu.duke.erss.ups.proto.UPStoAmazon.UAConnect prototype) {
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
   * Protobuf type {@code tutorial.UAConnect}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.UAConnect)
      edu.duke.erss.ups.proto.UPStoAmazon.UAConnectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UAConnect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UAConnect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.class, edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.Builder.class);
    }

    // Construct using edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.newBuilder()
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
      worldid_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UAConnect_descriptor;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UAConnect getDefaultInstanceForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.UAConnect.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UAConnect build() {
      edu.duke.erss.ups.proto.UPStoAmazon.UAConnect result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UAConnect buildPartial() {
      edu.duke.erss.ups.proto.UPStoAmazon.UAConnect result = new edu.duke.erss.ups.proto.UPStoAmazon.UAConnect(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.worldid_ = worldid_;
        to_bitField0_ |= 0x00000001;
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

    private long worldid_ ;
    /**
     * <code>required int64 worldid = 1;</code>
     * @return Whether the worldid field is set.
     */
    @java.lang.Override
    public boolean hasWorldid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required int64 worldid = 1;</code>
     * @return The worldid.
     */
    @java.lang.Override
    public long getWorldid() {
      return worldid_;
    }
    /**
     * <code>required int64 worldid = 1;</code>
     * @param value The worldid to set.
     * @return This builder for chaining.
     */
    public Builder setWorldid(long value) {
      bitField0_ |= 0x00000001;
      worldid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required int64 worldid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorldid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      worldid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tutorial.UAConnect)
  }

  // @@protoc_insertion_point(class_scope:tutorial.UAConnect)
  private static final edu.duke.erss.ups.proto.UPStoAmazon.UAConnect DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.erss.ups.proto.UPStoAmazon.UAConnect();
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UAConnect getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UAConnect>
      PARSER = new com.google.protobuf.AbstractParser<UAConnect>() {
    @java.lang.Override
    public UAConnect parsePartialFrom(
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

  public static com.google.protobuf.Parser<UAConnect> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UAConnect> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.UAConnect getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
