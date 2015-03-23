// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

/**
 * Protobuf type {@code grpc.example.routeguide.RouteSummary}
 *
 * <pre>
 * A RouteSummary is received in response to a RecordRoute rpc.
 *
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 * </pre>
 */
public  final class RouteSummary extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.example.routeguide.RouteSummary)
    RouteSummaryOrBuilder {
  // Use RouteSummary.newBuilder() to construct.
  private RouteSummary(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private RouteSummary() {
    pointCount_ = 0;
    featureCount_ = 0;
    distance_ = 0;
    elapsedTime_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RouteSummary(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            pointCount_ = input.readInt32();
            break;
          }
          case 16: {

            featureCount_ = input.readInt32();
            break;
          }
          case 24: {

            distance_ = input.readInt32();
            break;
          }
          case 32: {

            elapsedTime_ = input.readInt32();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.examples.routeguide.RouteGuideProto.internal_static_grpc_example_routeguide_RouteSummary_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.routeguide.RouteGuideProto.internal_static_grpc_example_routeguide_RouteSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.routeguide.RouteSummary.class, io.grpc.examples.routeguide.RouteSummary.Builder.class);
  }

  public static final com.google.protobuf.Parser<RouteSummary> PARSER =
      new com.google.protobuf.AbstractParser<RouteSummary>() {
    public RouteSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteSummary(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<RouteSummary> getParserForType() {
    return PARSER;
  }

  public static final int POINT_COUNT_FIELD_NUMBER = 1;
  private int pointCount_;
  /**
   * <code>optional int32 point_count = 1;</code>
   *
   * <pre>
   * The number of points received.
   * </pre>
   */
  public int getPointCount() {
    return pointCount_;
  }

  public static final int FEATURE_COUNT_FIELD_NUMBER = 2;
  private int featureCount_;
  /**
   * <code>optional int32 feature_count = 2;</code>
   *
   * <pre>
   * The number of known features passed while traversing the route.
   * </pre>
   */
  public int getFeatureCount() {
    return featureCount_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private int distance_;
  /**
   * <code>optional int32 distance = 3;</code>
   *
   * <pre>
   * The distance covered in metres.
   * </pre>
   */
  public int getDistance() {
    return distance_;
  }

  public static final int ELAPSED_TIME_FIELD_NUMBER = 4;
  private int elapsedTime_;
  /**
   * <code>optional int32 elapsed_time = 4;</code>
   *
   * <pre>
   * The duration of the traversal in seconds.
   * </pre>
   */
  public int getElapsedTime() {
    return elapsedTime_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (pointCount_ != 0) {
      output.writeInt32(1, pointCount_);
    }
    if (featureCount_ != 0) {
      output.writeInt32(2, featureCount_);
    }
    if (distance_ != 0) {
      output.writeInt32(3, distance_);
    }
    if (elapsedTime_ != 0) {
      output.writeInt32(4, elapsedTime_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (pointCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pointCount_);
    }
    if (featureCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, featureCount_);
    }
    if (distance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, distance_);
    }
    if (elapsedTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, elapsedTime_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.examples.routeguide.RouteSummary prototype) {
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
   * Protobuf type {@code grpc.example.routeguide.RouteSummary}
   *
   * <pre>
   * A RouteSummary is received in response to a RecordRoute rpc.
   *
   * It contains the number of individual points received, the number of
   * detected features, and the total distance covered as the cumulative sum of
   * the distance between each point.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.example.routeguide.RouteSummary)
      io.grpc.examples.routeguide.RouteSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_grpc_example_routeguide_RouteSummary_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_grpc_example_routeguide_RouteSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.routeguide.RouteSummary.class, io.grpc.examples.routeguide.RouteSummary.Builder.class);
    }

    // Construct using io.grpc.examples.routeguide.RouteSummary.newBuilder()
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
    public Builder clear() {
      super.clear();
      pointCount_ = 0;

      featureCount_ = 0;

      distance_ = 0;

      elapsedTime_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.routeguide.RouteGuideProto.internal_static_grpc_example_routeguide_RouteSummary_descriptor;
    }

    public io.grpc.examples.routeguide.RouteSummary getDefaultInstanceForType() {
      return io.grpc.examples.routeguide.RouteSummary.getDefaultInstance();
    }

    public io.grpc.examples.routeguide.RouteSummary build() {
      io.grpc.examples.routeguide.RouteSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.examples.routeguide.RouteSummary buildPartial() {
      io.grpc.examples.routeguide.RouteSummary result = new io.grpc.examples.routeguide.RouteSummary(this);
      result.pointCount_ = pointCount_;
      result.featureCount_ = featureCount_;
      result.distance_ = distance_;
      result.elapsedTime_ = elapsedTime_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.examples.routeguide.RouteSummary) {
        return mergeFrom((io.grpc.examples.routeguide.RouteSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.routeguide.RouteSummary other) {
      if (other == io.grpc.examples.routeguide.RouteSummary.getDefaultInstance()) return this;
      if (other.getPointCount() != 0) {
        setPointCount(other.getPointCount());
      }
      if (other.getFeatureCount() != 0) {
        setFeatureCount(other.getFeatureCount());
      }
      if (other.getDistance() != 0) {
        setDistance(other.getDistance());
      }
      if (other.getElapsedTime() != 0) {
        setElapsedTime(other.getElapsedTime());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.examples.routeguide.RouteSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.routeguide.RouteSummary) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pointCount_ ;
    /**
     * <code>optional int32 point_count = 1;</code>
     *
     * <pre>
     * The number of points received.
     * </pre>
     */
    public int getPointCount() {
      return pointCount_;
    }
    /**
     * <code>optional int32 point_count = 1;</code>
     *
     * <pre>
     * The number of points received.
     * </pre>
     */
    public Builder setPointCount(int value) {
      
      pointCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 point_count = 1;</code>
     *
     * <pre>
     * The number of points received.
     * </pre>
     */
    public Builder clearPointCount() {
      
      pointCount_ = 0;
      onChanged();
      return this;
    }

    private int featureCount_ ;
    /**
     * <code>optional int32 feature_count = 2;</code>
     *
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     */
    public int getFeatureCount() {
      return featureCount_;
    }
    /**
     * <code>optional int32 feature_count = 2;</code>
     *
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     */
    public Builder setFeatureCount(int value) {
      
      featureCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 feature_count = 2;</code>
     *
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     */
    public Builder clearFeatureCount() {
      
      featureCount_ = 0;
      onChanged();
      return this;
    }

    private int distance_ ;
    /**
     * <code>optional int32 distance = 3;</code>
     *
     * <pre>
     * The distance covered in metres.
     * </pre>
     */
    public int getDistance() {
      return distance_;
    }
    /**
     * <code>optional int32 distance = 3;</code>
     *
     * <pre>
     * The distance covered in metres.
     * </pre>
     */
    public Builder setDistance(int value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 distance = 3;</code>
     *
     * <pre>
     * The distance covered in metres.
     * </pre>
     */
    public Builder clearDistance() {
      
      distance_ = 0;
      onChanged();
      return this;
    }

    private int elapsedTime_ ;
    /**
     * <code>optional int32 elapsed_time = 4;</code>
     *
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     */
    public int getElapsedTime() {
      return elapsedTime_;
    }
    /**
     * <code>optional int32 elapsed_time = 4;</code>
     *
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     */
    public Builder setElapsedTime(int value) {
      
      elapsedTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 elapsed_time = 4;</code>
     *
     * <pre>
     * The duration of the traversal in seconds.
     * </pre>
     */
    public Builder clearElapsedTime() {
      
      elapsedTime_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.example.routeguide.RouteSummary)
  }

  // @@protoc_insertion_point(class_scope:grpc.example.routeguide.RouteSummary)
  private static final io.grpc.examples.routeguide.RouteSummary defaultInstance;static {
    defaultInstance = new io.grpc.examples.routeguide.RouteSummary();
  }

  public static io.grpc.examples.routeguide.RouteSummary getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.examples.routeguide.RouteSummary getDefaultInstanceForType() {
    return defaultInstance;
  }

}

