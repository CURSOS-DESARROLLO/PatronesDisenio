package devtalles.patrones.estructurales.b.bridge.ejercicio;

public class AlertNotification extends Notification {

    public AlertNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notify(String message) {
        this.channel.send(message);
    }
}
