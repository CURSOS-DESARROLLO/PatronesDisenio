package devtalles.patrones.estructurales.d.decorator.devtalles;

public class EmaiNotificationlDecorator extends NotificationDecorator {
    public EmaiNotificationlDecorator(Notification notification) {
        super(notification);
    }

    private void sendEmail(String message) {
        System.out.println(String.format("Enviando notificación por correo electronico: %s", message));
    }

    @Override
    public void send(String message) {
        super.send(message);
        this.sendEmail(message);
    }
}
