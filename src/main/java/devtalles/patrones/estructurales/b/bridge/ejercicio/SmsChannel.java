package devtalles.patrones.estructurales.b.bridge.ejercicio;

public class SmsChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println(String.format("Enviando un mensaje de texto con el mensaje: %s", message));
    }
}
