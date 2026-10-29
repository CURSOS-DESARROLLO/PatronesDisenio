package devtalles.patrones.estructurales.b.bridge.ejercicio;

public class ReminderNotification extends Notification {
    public ReminderNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notify(String message) {
        this.channel.send(message);
    }
}
