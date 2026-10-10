package devtalles.patrones.creacionales.c.abstractt.factory.devtalles;

public class FastFoodRestaurant implements Restaurant {
    @Override
    public Hamburguer createFood() {
        return new BeefHamburguer();
    }

    @Override
    public Drink createDrink() {
        return new SodaDrink();
    }
}
