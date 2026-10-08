package devtalles.patrones.creacionales.b.factory.method.devtalles;

/**
 * ! Productos concretos: implementan el comportamiento específico.
 */
public class BeefHamburguer implements Hamburguer {
    @Override
    public void prepare() {
        System.out.println("Creando Hamburguer de res");
    }
}
