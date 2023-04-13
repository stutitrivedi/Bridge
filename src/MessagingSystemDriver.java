// Driver program to send messages using different messaging apps and message types
public class MessagingSystemDriver {
    public static void main(String[] args) {
        // Create messaging apps
        MessagingApp whatsapp = new WhatsAppMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();

        // Create message types
        MessageType textMessage = new TextMessage();
        MessageType imageMessage = new ImageMessage();
        MessageType videoMessage = new VideoMessage();


        // Send messages using different messaging apps and message types
        whatsapp.send(textMessage);
        telegram.send(imageMessage);
        facebook.send(videoMessage);

        MessagingApp whatsapp1 = new WhatsAppMessagingApp();
        MessagingApp telegram1 = new TelegramMessagingApp();
        MessagingApp facebook1 = new FacebookMessagingApp();

        MessageType textMessage1 = new TextMessage();
        MessageType imageMessage1 = new ImageMessage();


        whatsapp1.send(imageMessage1);
        telegram1.send(textMessage1);
        facebook1.send(textMessage1);
    }
}