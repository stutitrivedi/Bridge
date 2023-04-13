// Concrete implementation of the MessagingApp interface for WhatsApp
public class WhatsAppMessagingApp implements MessagingApp {
    @Override
    public void send(MessageType messageType) {
        System.out.print("Sending message via WhatsApp: ");
        messageType.sendMessage();
    }
}