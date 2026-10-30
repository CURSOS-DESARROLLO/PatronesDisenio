package devtalles.patrones.estructurales.d.decorator.devtalles;

public class SmsNotificationDecorator extends NotificationDecorator {

    public SmsNotificationDecorator(Notification notification) {
        super(notification);
    }

    public void sendSms(String message) {
        System.out.println(String.format("Enviando notificación por SMS: %s", message));
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendSms(message);
    }
}
