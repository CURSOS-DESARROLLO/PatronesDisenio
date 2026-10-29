package devtalles.patrones.estructurales.b.bridge;

import devtalles.patrones.estructurales.b.bridge.devtalles.*;
import devtalles.patrones.estructurales.b.bridge.ejercicio.*;
import devtalles.patrones.util.Spacing;


/**
 * ! Patrón Bridge
 * Este patrón nos permite desacoplar una abstracción de su implementación,
 * de tal forma que ambas puedan variar independientemente.
 * <p>
 * * Es útil cuando se tienen múltiples implementaciones de una abstracción
 * * Se puede utilizar para separar la lógica de negocio de la lógica de presentación
 * * Se puede utilizar para separar la lógica de la interfaz de usuario también.
 * <p>
 * <p>
 * https://refactoring.guru/es/design-patterns/bridge
 */
public class Main {
    // !El beneficio principal es evitar una clase por cada combinación, como GuerreroConEspada, GuerreroConHacha, MagoConFuego
    // Agregar Arquero extends Personaje sin modificar las habilidades.
    // Agregar AtaqueHielo implements Habilidad sin modificar los personajes.

    public static void main(String[] args) {
        // ! Ataques
        Habilidad ataqueEspada = new AtaqueEspada();
        Habilidad ataqueFuego = new AtaqueFuego();
        Habilidad ataqueHacha = new AtaqueHacha();
        Habilidad ataqueMagico = new AtaqueMagico();


        // ! personajes
        Personaje mago = new Mago(ataqueMagico);
        mago.usarHabilidad();
        mago.setHabilidad(ataqueFuego);
        mago.usarHabilidad();

        Spacing.generarEspacio();

        Personaje guerrero = new Guerrero(ataqueHacha);
        guerrero.usarHabilidad();
        guerrero.setHabilidad(ataqueEspada);
        guerrero.usarHabilidad();

        Spacing.generarEspacio();
        Spacing.generarEspacio();

        // !TAREA
        //! canales
        NotificationChannel pushChannel = new PushChannel();
        NotificationChannel emailChannel = new EmailChannel();
        NotificationChannel smsChannel = new SmsChannel();

        String message = "Alguien ha intentado acceder a tu cuenta";
        Notification alertNotification = new AlertNotification(pushChannel);
        alertNotification.notify(message);
        alertNotification.setChannel(smsChannel);
        alertNotification.notify(message);
        alertNotification.setChannel(emailChannel);
        alertNotification.notify(message);

        Spacing.generarEspacio();

        message = "Recuerda hacer tu lección de joga a las 3pm";
        Notification reminderNotification = new ReminderNotification(pushChannel);
        reminderNotification.notify(message);
        reminderNotification.setChannel(emailChannel);
        reminderNotification.notify(message);

    }
}

/*
 * Factory Method permite que las subclases decidan qué objeto crear.
 * Bridge permite combinar dos jerarquías independientes mediante composición:
 * el tipo de notificación (alerta, recordatorio) y el canal (email, SMS, push).
 * Factory Method se enfoca en la creación; Bridge, en cómo colaboran los objetos.
 */
