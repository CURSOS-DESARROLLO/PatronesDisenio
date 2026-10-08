package devtalles.patrones.creacionales.b.factory.method.ia;

public abstract class NotificationService {
    abstract protected Notificacion crearNotificacion();

    public void enviarNotificacion() {
        Notificacion notificacion = this.crearNotificacion();
        notificacion.enviar();
    }
}
