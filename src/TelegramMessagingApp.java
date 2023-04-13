// Concrete implementation of the MessagingApp interface for Telegram
public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void send(MessageType messageType) {
        System.out.print("Sending message via Telegram: ");
        messageType.sendMessage();
    }
}
