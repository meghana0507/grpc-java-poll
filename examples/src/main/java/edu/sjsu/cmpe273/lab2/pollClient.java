package edu.sjsu.cmpe273.lab2;

import io.grpc.ChannelImpl;
import io.grpc.transport.netty.NegotiationType;
import io.grpc.transport.netty.NettyChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a poll id from the {@link pollServer}.
 */
public class pollClient {
  private static final Logger logger = Logger.getLogger(pollClient.class.getName());

  private final ChannelImpl channel;
  private final CreatePollServiceGrpc.CreatePollServiceBlockingStub blockingStub;

  public pollClient(String host, int port) {
    channel =
        NettyChannelBuilder.forAddress(host, port).negotiationType(NegotiationType.PLAINTEXT)
            .build();
    blockingStub = CreatePollServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTerminated(5, TimeUnit.SECONDS);
  }

  public void createPoll(String moderatorId, String question, String startedAt, String expiredAt, String[] choice) {	
	  if(choice==null || choice.length < 2){
	    new RuntimeException("RPC failed,choice must have two items!");
     }
	try{
	logger.info("Creating a new poll for moderator"+moderatorId);
	PollRequest request = PollRequest.newBuilder()
	  .setModeratorId(moderatorId)
	  .setQuestion(question)
	  .setStartedAt(startedAt)
	  .setExpiredAt(expiredAt)
	  .addChoice(choice[0])
	  .addChoice(choice[1])
	  .build();
      PollResponse response = blockingStub.createPoll(request);
      logger.info("Creating a new poll with id: " + response.getId());
    } catch (RuntimeException e) {
      logger.log(Level.WARNING, "RPC failed", e);
      return;
    }
  }

  public static void main(String[] args) throws Exception {
    pollClient client = new pollClient("localhost", 50051);
    try {
      /* Access a service running on the local machine on port 50051 */
		String moderatorId = "1";
		String question = "What type of smartphone do you have?";
		String startedAt = "2015-02-23T13:00:00.000Z";
		String expiredAt = "2015-02-24T13:00:00.000Z";
		String[] choice = new String[] {"Android","iPhone"};
      client.createPoll(moderatorId, question, startedAt, expiredAt, choice);
    } finally {
      client.shutdown();
    }
  }
}
