package devtalles.patrones.estructurales.b.bridge.ejercicio;

public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println(String.format("Enviando un correo con el mensaje: %s", message));
    }
}
