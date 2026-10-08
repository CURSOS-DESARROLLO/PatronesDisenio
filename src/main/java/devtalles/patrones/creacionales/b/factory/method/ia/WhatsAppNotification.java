package devtalles.patrones.creacionales.b.factory.method.ia;

public class WhatsAppNotification implements Notificacion {
    @Override
    public void enviar() {
        System.out.println("Realizando la notificación por WhatsApp...");
    }
}
