package devtalles.patrones.estructurales.b.bridge.devtalles;

public class AtaqueHacha implements Habilidad {
    @Override
    public void use() {
        System.out.println("Ataque con un Hacha!");
    }
}
