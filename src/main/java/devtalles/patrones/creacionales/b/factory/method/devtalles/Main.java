package devtalles.patrones.creacionales.b.factory.method;

import devtalles.patrones.creacionales.b.factory.method.devtalles.Restaurante;
import devtalles.patrones.creacionales.b.factory.method.devtalles.RestauranteBeef;
import devtalles.patrones.creacionales.b.factory.method.devtalles.RestauranteChicken;
import devtalles.patrones.creacionales.b.factory.method.ia.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ! Hamburguer es el producto (interface), define el contrato común ( preparar la burguer )
        // ! BeefHamburguer y ChickenHamburguer son los productos concretos, los que definen la funcionalidad concreta implementando el producto
        // ! Restaurante es el creador abstracto, no se pueden crear clases de ella. define el método fabrica que retorna una Hamburguer
        // ! RestauranteBeef y RestauranteChicken son los creadores concretos, los que definen que producto concreto se va a hacer
        // como los productos concretos al implementar Hamburguer, son de ese tipo

        /*Restaurante restaurante;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la hamburguesa que quiere: chicken/beef");
        String hamburguer = sc.nextLine();

        switch (hamburguer) {
            case "chicken":
                restaurante = new RestauranteChicken();
                break;
            case "beef":
                restaurante = new RestauranteBeef();
                break;
            default:
                throw new IllegalArgumentException("La hamburguera esta vacia");
        }

        restaurante.orderHamburguer();*/

        List<String> notificacionesConfiguradas = List.of("whatsapp", "correo");

        List<NotificationService> notificationServices = new ArrayList<>();

        notificacionesConfiguradas.stream().forEach(tipoNotificacion -> {
            switch (tipoNotificacion) {
                case "whatsapp" -> notificationServices.add(new WhatsAppNotificationCreator());
                case "correo" -> notificationServices.add(new CorreoNotificationCreator());
                case "push" -> notificationServices.add(new PushNotificationCreator());
            }
        });

        notificationServices.stream().forEach(NotificationService::enviarNotificacion);
        // ! las implementaciones propias para enviar un whats es en el producto concreto
    }
}
