// Concrete implementation of the MessageType interface for Text messages
public class TextMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Text sent");
    }
}