package devtalles.patrones.creacionales.c.abstractt.factory.devtalles;

public class HealthyFoodRestaurant implements Restaurant {
    @Override
    public Hamburguer createFood() {
        return new ChickenHamburguer();
    }

    @Override
    public Drink createDrink() {
        return new WaterDrink();
    }
}
