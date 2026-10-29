package devtalles.patrones.estructurales.b.bridge.devtalles;

public class AtaqueMagico implements Habilidad {
    @Override
    public void use() {
        System.out.println("Ataque con un hechizo mágico!");
    }
}
