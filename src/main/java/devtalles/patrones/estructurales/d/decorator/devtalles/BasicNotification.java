package devtalles.patrones.estructurales.d.decorator.devtalles;

public class BasicNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println(String.format("Haciendo una notificación: %s", message));
    }
}
