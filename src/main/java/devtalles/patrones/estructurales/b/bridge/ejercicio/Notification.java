package devtalles.patrones.estructurales.b.bridge.ejercicio;

public abstract class Notification {
    protected NotificationChannel channel;

    public Notification(NotificationChannel channel) {
        this.channel = channel;
    }

    public abstract void notify(String message);

    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }
}
