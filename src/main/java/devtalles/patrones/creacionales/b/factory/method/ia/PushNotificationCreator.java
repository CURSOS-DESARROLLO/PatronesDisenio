package devtalles.patrones.creacionales.b.factory.method.ia;

public class PushNotificationCreator extends NotificationService {
    @Override
    protected Notificacion crearNotificacion() {
        return new PushNotification();
    }
}
