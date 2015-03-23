package edu.sjsu.cmpe273.lab2;

import static io.grpc.stub.Calls.createMethodDescriptor;
import static io.grpc.stub.Calls.asyncUnaryCall;
import static io.grpc.stub.Calls.asyncServerStreamingCall;
import static io.grpc.stub.Calls.asyncClientStreamingCall;
import static io.grpc.stub.Calls.duplexStreamingCall;
import static io.grpc.stub.Calls.blockingUnaryCall;
import static io.grpc.stub.Calls.blockingServerStreamingCall;
import static io.grpc.stub.Calls.unaryFutureCall;
import static io.grpc.stub.ServerCalls.createMethodDefinition;
import static io.grpc.stub.ServerCalls.asyncUnaryRequestCall;
import static io.grpc.stub.ServerCalls.asyncStreamingRequestCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class CreatePollServiceGrpc {

  private static final io.grpc.stub.Method<edu.sjsu.cmpe273.lab2.PollRequest,
      edu.sjsu.cmpe273.lab2.PollResponse> METHOD_CREATE_POLL =
      io.grpc.stub.Method.create(
          io.grpc.MethodType.UNARY, "createPoll",
          io.grpc.proto.ProtoUtils.marshaller(edu.sjsu.cmpe273.lab2.PollRequest.PARSER),
          io.grpc.proto.ProtoUtils.marshaller(edu.sjsu.cmpe273.lab2.PollResponse.PARSER));

  public static CreatePollServiceStub newStub(io.grpc.Channel channel) {
    return new CreatePollServiceStub(channel, CONFIG);
  }

  public static CreatePollServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreatePollServiceBlockingStub(channel, CONFIG);
  }

  public static CreatePollServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreatePollServiceFutureStub(channel, CONFIG);
  }

  public static final CreatePollServiceServiceDescriptor CONFIG =
      new CreatePollServiceServiceDescriptor();

  @javax.annotation.concurrent.Immutable
  public static class CreatePollServiceServiceDescriptor extends
      io.grpc.stub.AbstractServiceDescriptor<CreatePollServiceServiceDescriptor> {
    public final io.grpc.MethodDescriptor<edu.sjsu.cmpe273.lab2.PollRequest,
        edu.sjsu.cmpe273.lab2.PollResponse> createPoll;

    private CreatePollServiceServiceDescriptor() {
      createPoll = createMethodDescriptor(
          "edu.sjsu.cmpe273.lab2.CreatePollService", METHOD_CREATE_POLL);
    }

    @SuppressWarnings("unchecked")
    private CreatePollServiceServiceDescriptor(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      createPoll = (io.grpc.MethodDescriptor<edu.sjsu.cmpe273.lab2.PollRequest,
          edu.sjsu.cmpe273.lab2.PollResponse>) methodMap.get(
          CONFIG.createPoll.getName());
    }

    @java.lang.Override
    protected CreatePollServiceServiceDescriptor build(
        java.util.Map<java.lang.String, io.grpc.MethodDescriptor<?, ?>> methodMap) {
      return new CreatePollServiceServiceDescriptor(methodMap);
    }

    @java.lang.Override
    public com.google.common.collect.ImmutableList<io.grpc.MethodDescriptor<?, ?>> methods() {
      return com.google.common.collect.ImmutableList.<io.grpc.MethodDescriptor<?, ?>>of(
          createPoll);
    }
  }

  public static interface CreatePollService {

    public void createPoll(edu.sjsu.cmpe273.lab2.PollRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver);
  }

  public static interface CreatePollServiceBlockingClient {

    public edu.sjsu.cmpe273.lab2.PollResponse createPoll(edu.sjsu.cmpe273.lab2.PollRequest request);
  }

  public static interface CreatePollServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cmpe273.lab2.PollResponse> createPoll(
        edu.sjsu.cmpe273.lab2.PollRequest request);
  }

  public static class CreatePollServiceStub extends
      io.grpc.stub.AbstractStub<CreatePollServiceStub, CreatePollServiceServiceDescriptor>
      implements CreatePollService {
    private CreatePollServiceStub(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollServiceStub build(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      return new CreatePollServiceStub(channel, config);
    }

    @java.lang.Override
    public void createPoll(edu.sjsu.cmpe273.lab2.PollRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver) {
      asyncUnaryCall(
          channel.newCall(config.createPoll), request, responseObserver);
    }
  }

  public static class CreatePollServiceBlockingStub extends
      io.grpc.stub.AbstractStub<CreatePollServiceBlockingStub, CreatePollServiceServiceDescriptor>
      implements CreatePollServiceBlockingClient {
    private CreatePollServiceBlockingStub(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollServiceBlockingStub build(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      return new CreatePollServiceBlockingStub(channel, config);
    }

    @java.lang.Override
    public edu.sjsu.cmpe273.lab2.PollResponse createPoll(edu.sjsu.cmpe273.lab2.PollRequest request) {
      return blockingUnaryCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static class CreatePollServiceFutureStub extends
      io.grpc.stub.AbstractStub<CreatePollServiceFutureStub, CreatePollServiceServiceDescriptor>
      implements CreatePollServiceFutureClient {
    private CreatePollServiceFutureStub(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      super(channel, config);
    }

    @java.lang.Override
    protected CreatePollServiceFutureStub build(io.grpc.Channel channel,
        CreatePollServiceServiceDescriptor config) {
      return new CreatePollServiceFutureStub(channel, config);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cmpe273.lab2.PollResponse> createPoll(
        edu.sjsu.cmpe273.lab2.PollRequest request) {
      return unaryFutureCall(
          channel.newCall(config.createPoll), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final CreatePollService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder("edu.sjsu.cmpe273.lab2.CreatePollService")
      .addMethod(createMethodDefinition(
          METHOD_CREATE_POLL,
          asyncUnaryRequestCall(
            new io.grpc.stub.ServerCalls.UnaryRequestMethod<
                edu.sjsu.cmpe273.lab2.PollRequest,
                edu.sjsu.cmpe273.lab2.PollResponse>() {
              @java.lang.Override
              public void invoke(
                  edu.sjsu.cmpe273.lab2.PollRequest request,
                  io.grpc.stub.StreamObserver<edu.sjsu.cmpe273.lab2.PollResponse> responseObserver) {
                serviceImpl.createPoll(request, responseObserver);
              }
            }))).build();
  }
}
