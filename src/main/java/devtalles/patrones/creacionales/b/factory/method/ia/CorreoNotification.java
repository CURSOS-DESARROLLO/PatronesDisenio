package devtalles.patrones.creacionales.b.factory.method.ia;

public class CorreoNotification implements Notificacion {
    public void enviar() {
        System.out.println("Haciendo envio de notificación por correo electronico...");
    }
}
