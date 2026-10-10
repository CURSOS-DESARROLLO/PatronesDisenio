package devtalles.patrones.creacionales.c.abstractt.factory;

import devtalles.patrones.creacionales.c.abstractt.factory.devtalles.*;
import devtalles.patrones.creacionales.c.abstractt.factory.ejercicio.*;
import devtalles.patrones.util.Spacing;

/**
 * !  {@code Abstract Factory}
 * Es un patrón de diseño que permite crear familias de objetos relacionados
 * sin especificar sus clases concretas.
 * <p>
 * En lugar de crear objetos individuales directamente,
 * creamos fábricas que producen un conjunto de objetos relacionados.
 * <p>
 * * Es útil cuando necesitas crear objetos que son parte de una familia
 * * y quieres asegurarte de que estos objetos se complementen entre sí.
 * <p>
 * https://refactoring.guru/es/design-patterns/abstract-factory
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Comida poco saludable:");
        crearComida(new FastFoodRestaurant());

        System.out.println("\nComida saludable:");
        crearComida(new HealthyFoodRestaurant());

        Spacing.generarEspacio();

        System.out.println("Vehiculo electrico");
        crearVehiculo(new ElectricVehicleFactory());

        System.out.println("\nVehiculo gas");
        crearVehiculo(new GasVehicleFactory());
    }

    public static void crearComida(Restaurant restaurant) {
        Hamburguer comida = restaurant.createFood();
        Drink drink = restaurant.createDrink();

        comida.prepare();
        drink.pourDrink();
    }

    public static void crearVehiculo(VehicleFactory vehicleFactory) {
        Vehicle vehicle = vehicleFactory.createVehicle();
        Engine engine = vehicleFactory.createEngine();

        vehicle.assemble();
        engine.start();
    }
}
