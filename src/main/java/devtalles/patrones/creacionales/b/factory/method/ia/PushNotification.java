package devtalles.patrones.creacionales.b.factory.method.ia;

public class PushNotification implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Haciendo envio de notificación push...");
    }
}
