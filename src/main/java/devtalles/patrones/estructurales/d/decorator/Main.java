package devtalles.patrones.estructurales.d.decorator;

import devtalles.patrones.estructurales.d.decorator.devtalles.BasicNotification;
import devtalles.patrones.estructurales.d.decorator.devtalles.EmaiNotificationlDecorator;
import devtalles.patrones.estructurales.d.decorator.devtalles.Notification;
import devtalles.patrones.estructurales.d.decorator.devtalles.SmsNotificationDecorator;
import devtalles.patrones.estructurales.d.decorator.ejercicio.*;
import devtalles.patrones.estructurales.d.decorator.ejercicio.Character;
import devtalles.patrones.util.Spacing;

/**
 * ! Patrón decorador
 * Es un patrón de diseño estructural que permite añadir
 * funcionalidades a objetos, colocando estos objetos dentro de
 * objetos encapsuladores especiales que contienen estas funcionalidades.
 * <p>
 * No confundirlo con los decoradores de TypeScript que son anotaciones.
 * <p>
 * * Es útil cuando necesitas añadir funcionalidades a objetos
 * * de manera dinámica y flexible.
 * <p>
 * https://refactoring.guru/es/design-patterns/decorator
 */

public class Main {
    public static void main(String[] args) {
        //! Devtalles
        // un tipo normal, sin decoradores
        Notification notificacion = new BasicNotification();

        // envuelve el objeto en un SmSNotification. sobreescribe el metodo send
        // pero mantiene la lógica ya implementada en el padre con super.send
        // y le agrega una nueva funcionalidad
        notificacion = new SmsNotificationDecorator(notificacion);

        // envuelve el objeto nuevamente, ahora en un EmailNotification. sobreescribe el metodo send
        // pero mantiene la lógica ya implementada en el padre con super.send
        // y le agrega una nueva funcionalidad
        notificacion = new EmaiNotificationlDecorator(notificacion);

        // al estar envueltos varios objetos de tipo bas Notificaction, al hacer un send
        // se comienzan a ejecutar los super.send.
        notificacion.send("Alerta de seguridad");


        Spacing.generarEspacio();


        //! ejercicio
        Character character = new BasicCharacter();
        System.out.println(String.format("%s \n con los poderes: %s", character.getDescription(), character.getStats()));

        character = new HelmetDecorator(character);
        System.out.println(String.format("%s \n con los poderes: %s", character.getDescription(), character.getStats()));

        character = new ShieldDecorator(character);
        System.out.println(String.format("%s \n con los poderes: %s", character.getDescription(), character.getStats()));

        character = new SwordDecorator(character);
        System.out.println(String.format("%s \n con los poderes: %s", character.getDescription(), character.getStats()));

    }
}
