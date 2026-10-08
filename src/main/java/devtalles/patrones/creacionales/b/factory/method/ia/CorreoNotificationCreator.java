package devtalles.patrones.creacionales.b.factory.method.ia;

public class CorreoNotificationCreator extends NotificationService {
    @Override
    protected Notificacion crearNotificacion() {
        return new  CorreoNotification();
    }
}
