package org.embox.robobot.proto;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/OptionMessage.proto

public final class OptionMessage {
  private OptionMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OptionMessageEntityOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 id = 1;
    /**
     * <code>optional int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();

    // optional int32 type = 2;
    /**
     * <code>optional int32 type = 2;</code>
     */
    boolean hasType();
    /**
     * <code>optional int32 type = 2;</code>
     */
    int getType();

    // required int32 sensors = 3;
    /**
     * <code>required int32 sensors = 3;</code>
     */
    boolean hasSensors();
    /**
     * <code>required int32 sensors = 3;</code>
     */
    int getSensors();

    // required int32 commands = 4;
    /**
     * <code>required int32 commands = 4;</code>
     */
    boolean hasCommands();
    /**
     * <code>required int32 commands = 4;</code>
     */
    int getCommands();
  }
  /**
   * Protobuf type {@code OptionMessageEntity}
   */
  public static final class OptionMessageEntity extends
      com.google.protobuf.GeneratedMessage
      implements OptionMessageEntityOrBuilder {
    // Use OptionMessageEntity.newBuilder() to construct.
    private OptionMessageEntity(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OptionMessageEntity(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OptionMessageEntity defaultInstance;
    public static OptionMessageEntity getDefaultInstance() {
      return defaultInstance;
    }

    public OptionMessageEntity getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OptionMessageEntity(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              type_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sensors_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              commands_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return OptionMessage.internal_static_OptionMessageEntity_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OptionMessage.internal_static_OptionMessageEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OptionMessage.OptionMessageEntity.class, OptionMessage.OptionMessageEntity.Builder.class);
    }

    public static com.google.protobuf.Parser<OptionMessageEntity> PARSER =
        new com.google.protobuf.AbstractParser<OptionMessageEntity>() {
      public OptionMessageEntity parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OptionMessageEntity(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OptionMessageEntity> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    // optional int32 type = 2;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>optional int32 type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }

    // required int32 sensors = 3;
    public static final int SENSORS_FIELD_NUMBER = 3;
    private int sensors_;
    /**
     * <code>required int32 sensors = 3;</code>
     */
    public boolean hasSensors() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 sensors = 3;</code>
     */
    public int getSensors() {
      return sensors_;
    }

    // required int32 commands = 4;
    public static final int COMMANDS_FIELD_NUMBER = 4;
    private int commands_;
    /**
     * <code>required int32 commands = 4;</code>
     */
    public boolean hasCommands() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 commands = 4;</code>
     */
    public int getCommands() {
      return commands_;
    }

    private void initFields() {
      id_ = 0;
      type_ = 0;
      sensors_ = 0;
      commands_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSensors()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCommands()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, sensors_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, commands_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, sensors_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, commands_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static OptionMessage.OptionMessageEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static OptionMessage.OptionMessageEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static OptionMessage.OptionMessageEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static OptionMessage.OptionMessageEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(OptionMessage.OptionMessageEntity prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code OptionMessageEntity}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements OptionMessage.OptionMessageEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OptionMessage.internal_static_OptionMessageEntity_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OptionMessage.internal_static_OptionMessageEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OptionMessage.OptionMessageEntity.class, OptionMessage.OptionMessageEntity.Builder.class);
      }

      // Construct using OptionMessage.OptionMessageEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        sensors_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        commands_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OptionMessage.internal_static_OptionMessageEntity_descriptor;
      }

      public OptionMessage.OptionMessageEntity getDefaultInstanceForType() {
        return OptionMessage.OptionMessageEntity.getDefaultInstance();
      }

      public OptionMessage.OptionMessageEntity build() {
        OptionMessage.OptionMessageEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public OptionMessage.OptionMessageEntity buildPartial() {
        OptionMessage.OptionMessageEntity result = new OptionMessage.OptionMessageEntity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sensors_ = sensors_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.commands_ = commands_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof OptionMessage.OptionMessageEntity) {
          return mergeFrom((OptionMessage.OptionMessageEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OptionMessage.OptionMessageEntity other) {
        if (other == OptionMessage.OptionMessageEntity.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasSensors()) {
          setSensors(other.getSensors());
        }
        if (other.hasCommands()) {
          setCommands(other.getCommands());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSensors()) {
          
          return false;
        }
        if (!hasCommands()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        OptionMessage.OptionMessageEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OptionMessage.OptionMessageEntity) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 id = 1;
      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      // optional int32 type = 2;
      private int type_ ;
      /**
       * <code>optional int32 type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 type = 2;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>optional int32 type = 2;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      // required int32 sensors = 3;
      private int sensors_ ;
      /**
       * <code>required int32 sensors = 3;</code>
       */
      public boolean hasSensors() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 sensors = 3;</code>
       */
      public int getSensors() {
        return sensors_;
      }
      /**
       * <code>required int32 sensors = 3;</code>
       */
      public Builder setSensors(int value) {
        bitField0_ |= 0x00000004;
        sensors_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 sensors = 3;</code>
       */
      public Builder clearSensors() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sensors_ = 0;
        onChanged();
        return this;
      }

      // required int32 commands = 4;
      private int commands_ ;
      /**
       * <code>required int32 commands = 4;</code>
       */
      public boolean hasCommands() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 commands = 4;</code>
       */
      public int getCommands() {
        return commands_;
      }
      /**
       * <code>required int32 commands = 4;</code>
       */
      public Builder setCommands(int value) {
        bitField0_ |= 0x00000008;
        commands_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 commands = 4;</code>
       */
      public Builder clearCommands() {
        bitField0_ = (bitField0_ & ~0x00000008);
        commands_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:OptionMessageEntity)
    }

    static {
      defaultInstance = new OptionMessageEntity(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:OptionMessageEntity)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_OptionMessageEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OptionMessageEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proto/OptionMessage.proto\"R\n\023OptionMes" +
      "sageEntity\022\n\n\002id\030\001 \001(\005\022\014\n\004type\030\002 \001(\005\022\017\n\007" +
      "sensors\030\003 \002(\005\022\020\n\010commands\030\004 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_OptionMessageEntity_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_OptionMessageEntity_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_OptionMessageEntity_descriptor,
              new java.lang.String[] { "Id", "Type", "Sensors", "Commands", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}