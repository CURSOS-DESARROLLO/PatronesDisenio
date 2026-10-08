package devtalles.patrones.creacionales.b.factory.method.devtalles;

public class ChickenHamburguer implements Hamburguer {
    @Override
    public void prepare() {
        System.out.println("Creando Hamburguer de pio");
    }
}
