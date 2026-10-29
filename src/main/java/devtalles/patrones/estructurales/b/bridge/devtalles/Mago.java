package devtalles.patrones.estructurales.b.bridge.devtalles;

public class Mago extends Personaje {
    public Mago(Habilidad habilidad) {
        super(habilidad);
    }

    @Override
    public void usarHabilidad() {
        System.out.println("El mago esta listo para luchar!");
        this.habilidad.use();
    }
}
