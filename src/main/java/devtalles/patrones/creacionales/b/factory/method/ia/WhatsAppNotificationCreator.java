package devtalles.patrones.creacionales.b.factory.method.ia;

public class WhatsAppNotificationCreator extends NotificationService {
    @Override
    public Notificacion crearNotificacion () {
        return new WhatsAppNotification();
    }
}
