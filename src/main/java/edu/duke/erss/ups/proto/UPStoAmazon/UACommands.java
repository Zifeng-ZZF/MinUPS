// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: withAmazon.proto

package edu.duke.erss.ups.proto.UPStoAmazon;

/**
 * Protobuf type {@code tutorial.UACommands}
 */
public final class UACommands extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.UACommands)
    UACommandsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UACommands.newBuilder() to construct.
  private UACommands(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UACommands() {
    pick_ = java.util.Collections.emptyList();
    load_ = java.util.Collections.emptyList();
    acks_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UACommands();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommands_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommands_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.duke.erss.ups.proto.UPStoAmazon.UACommands.class, edu.duke.erss.ups.proto.UPStoAmazon.UACommands.Builder.class);
  }

  public static final int PICK_FIELD_NUMBER = 1;
  private java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick> pick_;
  /**
   * <code>repeated .tutorial.AmazonPick pick = 1;</code>
   */
  @java.lang.Override
  public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick> getPickList() {
    return pick_;
  }
  /**
   * <code>repeated .tutorial.AmazonPick pick = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder> 
      getPickOrBuilderList() {
    return pick_;
  }
  /**
   * <code>repeated .tutorial.AmazonPick pick = 1;</code>
   */
  @java.lang.Override
  public int getPickCount() {
    return pick_.size();
  }
  /**
   * <code>repeated .tutorial.AmazonPick pick = 1;</code>
   */
  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick getPick(int index) {
    return pick_.get(index);
  }
  /**
   * <code>repeated .tutorial.AmazonPick pick = 1;</code>
   */
  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder getPickOrBuilder(
      int index) {
    return pick_.get(index);
  }

  public static final int LOAD_FIELD_NUMBER = 2;
  private java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded> load_;
  /**
   * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
   */
  @java.lang.Override
  public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded> getLoadList() {
    return load_;
  }
  /**
   * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder> 
      getLoadOrBuilderList() {
    return load_;
  }
  /**
   * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
   */
  @java.lang.Override
  public int getLoadCount() {
    return load_.size();
  }
  /**
   * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
   */
  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded getLoad(int index) {
    return load_.get(index);
  }
  /**
   * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
   */
  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder getLoadOrBuilder(
      int index) {
    return load_.get(index);
  }

  public static final int ACKS_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList acks_;
  /**
   * <code>repeated int64 acks = 3;</code>
   * @return A list containing the acks.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAcksList() {
    return acks_;
  }
  /**
   * <code>repeated int64 acks = 3;</code>
   * @return The count of acks.
   */
  public int getAcksCount() {
    return acks_.size();
  }
  /**
   * <code>repeated int64 acks = 3;</code>
   * @param index The index of the element to return.
   * @return The acks at the given index.
   */
  public long getAcks(int index) {
    return acks_.getLong(index);
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands parseFrom(
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
  public static Builder newBuilder(edu.duke.erss.ups.proto.UPStoAmazon.UACommands prototype) {
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
   * Protobuf type {@code tutorial.UACommands}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.UACommands)
      edu.duke.erss.ups.proto.UPStoAmazon.UACommandsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommands_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommands_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.duke.erss.ups.proto.UPStoAmazon.UACommands.class, edu.duke.erss.ups.proto.UPStoAmazon.UACommands.Builder.class);
    }

    // Construct using edu.duke.erss.ups.proto.UPStoAmazon.UACommands.newBuilder()
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
        getPickFieldBuilder();
        getLoadFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pickBuilder_ == null) {
        pick_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pickBuilder_.clear();
      }
      if (loadBuilder_ == null) {
        load_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        loadBuilder_.clear();
      }
      acks_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.WithAmazon.internal_static_tutorial_UACommands_descriptor;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UACommands getDefaultInstanceForType() {
      return edu.duke.erss.ups.proto.UPStoAmazon.UACommands.getDefaultInstance();
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UACommands build() {
      edu.duke.erss.ups.proto.UPStoAmazon.UACommands result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.duke.erss.ups.proto.UPStoAmazon.UACommands buildPartial() {
      edu.duke.erss.ups.proto.UPStoAmazon.UACommands result = new edu.duke.erss.ups.proto.UPStoAmazon.UACommands(this);
      int from_bitField0_ = bitField0_;
      if (pickBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pick_ = java.util.Collections.unmodifiableList(pick_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pick_ = pick_;
      } else {
        result.pick_ = pickBuilder_.build();
      }
      if (loadBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          load_ = java.util.Collections.unmodifiableList(load_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.load_ = load_;
      } else {
        result.load_ = loadBuilder_.build();
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        acks_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.acks_ = acks_;
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

    private java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick> pick_ =
      java.util.Collections.emptyList();
    private void ensurePickIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pick_ = new java.util.ArrayList<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick>(pick_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder> pickBuilder_;

    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick> getPickList() {
      if (pickBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pick_);
      } else {
        return pickBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public int getPickCount() {
      if (pickBuilder_ == null) {
        return pick_.size();
      } else {
        return pickBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick getPick(int index) {
      if (pickBuilder_ == null) {
        return pick_.get(index);
      } else {
        return pickBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder setPick(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick value) {
      if (pickBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePickIsMutable();
        pick_.set(index, value);
        onChanged();
      } else {
        pickBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder setPick(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder builderForValue) {
      if (pickBuilder_ == null) {
        ensurePickIsMutable();
        pick_.set(index, builderForValue.build());
        onChanged();
      } else {
        pickBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder addPick(edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick value) {
      if (pickBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePickIsMutable();
        pick_.add(value);
        onChanged();
      } else {
        pickBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder addPick(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick value) {
      if (pickBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePickIsMutable();
        pick_.add(index, value);
        onChanged();
      } else {
        pickBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder addPick(
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder builderForValue) {
      if (pickBuilder_ == null) {
        ensurePickIsMutable();
        pick_.add(builderForValue.build());
        onChanged();
      } else {
        pickBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder addPick(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder builderForValue) {
      if (pickBuilder_ == null) {
        ensurePickIsMutable();
        pick_.add(index, builderForValue.build());
        onChanged();
      } else {
        pickBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder addAllPick(
        java.lang.Iterable<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick> values) {
      if (pickBuilder_ == null) {
        ensurePickIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pick_);
        onChanged();
      } else {
        pickBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder clearPick() {
      if (pickBuilder_ == null) {
        pick_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pickBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public Builder removePick(int index) {
      if (pickBuilder_ == null) {
        ensurePickIsMutable();
        pick_.remove(index);
        onChanged();
      } else {
        pickBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder getPickBuilder(
        int index) {
      return getPickFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder getPickOrBuilder(
        int index) {
      if (pickBuilder_ == null) {
        return pick_.get(index);  } else {
        return pickBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder> 
         getPickOrBuilderList() {
      if (pickBuilder_ != null) {
        return pickBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pick_);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder addPickBuilder() {
      return getPickFieldBuilder().addBuilder(
          edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder addPickBuilder(
        int index) {
      return getPickFieldBuilder().addBuilder(
          index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.AmazonPick pick = 1;</code>
     */
    public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder> 
         getPickBuilderList() {
      return getPickFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder> 
        getPickFieldBuilder() {
      if (pickBuilder_ == null) {
        pickBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPick.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonPickOrBuilder>(
                pick_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pick_ = null;
      }
      return pickBuilder_;
    }

    private java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded> load_ =
      java.util.Collections.emptyList();
    private void ensureLoadIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        load_ = new java.util.ArrayList<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded>(load_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder> loadBuilder_;

    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded> getLoadList() {
      if (loadBuilder_ == null) {
        return java.util.Collections.unmodifiableList(load_);
      } else {
        return loadBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public int getLoadCount() {
      if (loadBuilder_ == null) {
        return load_.size();
      } else {
        return loadBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded getLoad(int index) {
      if (loadBuilder_ == null) {
        return load_.get(index);
      } else {
        return loadBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder setLoad(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded value) {
      if (loadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoadIsMutable();
        load_.set(index, value);
        onChanged();
      } else {
        loadBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder setLoad(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder builderForValue) {
      if (loadBuilder_ == null) {
        ensureLoadIsMutable();
        load_.set(index, builderForValue.build());
        onChanged();
      } else {
        loadBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder addLoad(edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded value) {
      if (loadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoadIsMutable();
        load_.add(value);
        onChanged();
      } else {
        loadBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder addLoad(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded value) {
      if (loadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLoadIsMutable();
        load_.add(index, value);
        onChanged();
      } else {
        loadBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder addLoad(
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder builderForValue) {
      if (loadBuilder_ == null) {
        ensureLoadIsMutable();
        load_.add(builderForValue.build());
        onChanged();
      } else {
        loadBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder addLoad(
        int index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder builderForValue) {
      if (loadBuilder_ == null) {
        ensureLoadIsMutable();
        load_.add(index, builderForValue.build());
        onChanged();
      } else {
        loadBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder addAllLoad(
        java.lang.Iterable<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded> values) {
      if (loadBuilder_ == null) {
        ensureLoadIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, load_);
        onChanged();
      } else {
        loadBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder clearLoad() {
      if (loadBuilder_ == null) {
        load_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        loadBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public Builder removeLoad(int index) {
      if (loadBuilder_ == null) {
        ensureLoadIsMutable();
        load_.remove(index);
        onChanged();
      } else {
        loadBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder getLoadBuilder(
        int index) {
      return getLoadFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder getLoadOrBuilder(
        int index) {
      if (loadBuilder_ == null) {
        return load_.get(index);  } else {
        return loadBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public java.util.List<? extends edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder> 
         getLoadOrBuilderList() {
      if (loadBuilder_ != null) {
        return loadBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(load_);
      }
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder addLoadBuilder() {
      return getLoadFieldBuilder().addBuilder(
          edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder addLoadBuilder(
        int index) {
      return getLoadFieldBuilder().addBuilder(
          index, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.AmazonLoaded load = 2;</code>
     */
    public java.util.List<edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder> 
         getLoadBuilderList() {
      return getLoadFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder> 
        getLoadFieldBuilder() {
      if (loadBuilder_ == null) {
        loadBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoaded.Builder, edu.duke.erss.ups.proto.UPStoAmazon.AmazonLoadedOrBuilder>(
                load_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        load_ = null;
      }
      return loadBuilder_;
    }

    private com.google.protobuf.Internal.LongList acks_ = emptyLongList();
    private void ensureAcksIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        acks_ = mutableCopy(acks_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @return A list containing the acks.
     */
    public java.util.List<java.lang.Long>
        getAcksList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(acks_) : acks_;
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @return The count of acks.
     */
    public int getAcksCount() {
      return acks_.size();
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @param index The index of the element to return.
     * @return The acks at the given index.
     */
    public long getAcks(int index) {
      return acks_.getLong(index);
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @param index The index to set the value at.
     * @param value The acks to set.
     * @return This builder for chaining.
     */
    public Builder setAcks(
        int index, long value) {
      ensureAcksIsMutable();
      acks_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @param value The acks to add.
     * @return This builder for chaining.
     */
    public Builder addAcks(long value) {
      ensureAcksIsMutable();
      acks_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @param values The acks to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcks(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAcksIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, acks_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 acks = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAcks() {
      acks_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:tutorial.UACommands)
  }

  // @@protoc_insertion_point(class_scope:tutorial.UACommands)
  private static final edu.duke.erss.ups.proto.UPStoAmazon.UACommands DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.duke.erss.ups.proto.UPStoAmazon.UACommands();
  }

  public static edu.duke.erss.ups.proto.UPStoAmazon.UACommands getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<UACommands>
      PARSER = new com.google.protobuf.AbstractParser<UACommands>() {
    @java.lang.Override
    public UACommands parsePartialFrom(
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

  public static com.google.protobuf.Parser<UACommands> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UACommands> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.duke.erss.ups.proto.UPStoAmazon.UACommands getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

