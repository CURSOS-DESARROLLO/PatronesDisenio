package devtalles.patrones.estructurales.b.bridge.devtalles;

public class AtaqueEspada implements Habilidad {
    @Override
    public void use() {
        System.out.println("Ataque con una espada!");
    }
}
