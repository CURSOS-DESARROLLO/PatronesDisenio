package devtalles.patrones.estructurales.b.bridge.devtalles;

public class AtaqueFuego implements Habilidad {
    @Override
    public void use() {
        System.out.println("Ataque con una bola de fuego!");
    }
}
