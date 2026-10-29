package devtalles.patrones.estructurales.b.bridge.ejercicio;

public class PushChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println(String.format("Enviando una push con el mensaje: %s", message));
    }
}
