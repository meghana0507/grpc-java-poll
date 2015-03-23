package edu.sjsu.cmpe273.lab2;

import io.grpc.ServerImpl;
import io.grpc.stub.StreamObserver;
import io.grpc.transport.netty.NettyServerBuilder;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/**
 * Server that manages startup/shutdown of a {@code CreatePollService} server.
 */
public class pollServer {
  
  private static final Logger logger = Logger.getLogger(pollServer.class.getName());
  private final AtomicLong pollCounter = new AtomicLong(27072);
  
  /* The port on which the server should run */
  private int port = 50051;
  private ServerImpl server;

  private void start() throws Exception {
    server = NettyServerBuilder.forPort(port)
        .addService(CreatePollServiceGrpc.bindService(new CreatePollServiceImpl()))
        .build().start();
    logger.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        System.err.println("*** shutting down gRPC server since JVM is shutting down");
        pollServer.this.stop();
        System.err.println("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Main launches the server from the command line.
   */
  public static void main(String[] args) throws Exception {
    final pollServer server = new pollServer();
    server.start();
  }

  private class CreatePollServiceImpl implements CreatePollServiceGrpc.CreatePollService {

    @Override
    public void createPoll(PollRequest req, StreamObserver<PollResponse> responseObserver) {
      
	PollResponse reply = PollResponse.newBuilder()
	  .setId(Long.toString(pollCounter.incrementAndGet(), 36).toUpperCase())
	  .build();
	
    logger.info("Moderator id is:"+ req.getModeratorId());
      responseObserver.onValue(reply);
      responseObserver.onCompleted();
    }
  }
}
