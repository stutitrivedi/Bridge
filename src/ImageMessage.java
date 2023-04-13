// Concrete implementation of the MessageType interface for Image messages
public class ImageMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Image sent");
    }
}