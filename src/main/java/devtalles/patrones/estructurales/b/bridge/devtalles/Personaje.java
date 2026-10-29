package devtalles.patrones.estructurales.b.bridge.devtalles;

public abstract class Personaje {
    protected Habilidad habilidad;

    public Personaje(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public abstract void usarHabilidad();

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
}
