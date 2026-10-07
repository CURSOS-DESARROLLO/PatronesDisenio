package devtalles.patrones.creacionales.a.builder.devtalles;


/**
 * ! Patrón Builder:
 * Es un patrón de diseño creacional que nos permite construir objetos complejos
 * paso a paso.
 * <p>
 * El patrón nos permite producir distintos tipos y representaciones
 * de un objeto empleando el mismo código de construcción.
 * <p>
 * * Es útil cuando necesitamos construir un objeto complejo con muchas partes
 * * y queremos que el proceso de construcción sea independiente de las partes
 * * que lo componen.
 * <p>
 * https://refactoring.guru/es/design-patterns/builder
 */
public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;

    public Computer() {
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Computer DEVTALLES{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", ram='").append(ram).append('\'');
        sb.append(", storage='").append(storage).append('\'');
        sb.append(", gpu='").append(gpu).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
