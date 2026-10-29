package devtalles.patrones.estructurales.b.bridge.devtalles;

public class Guerrero extends Personaje {
    public Guerrero(Habilidad habilidad) {
        super(habilidad);
    }

    @Override
    public void usarHabilidad() {
        System.out.println("El Guerrero esta listo para luchar!");
        this.habilidad.use();
    }
}
