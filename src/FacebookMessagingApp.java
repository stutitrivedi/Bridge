// Concrete implementation of the MessagingApp interface for Facebook Messenger
public class FacebookMessagingApp implements MessagingApp {
    @Override
    public void send(MessageType messageType) {
        System.out.print("Sending message via Facebook Messenger: ");
        messageType.sendMessage();
    }
}