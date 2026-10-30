package devtalles.patrones.estructurales.e.facade.ejercicio;

public class Memory {
    public void load(int position, String data) {
        System.out.println(String.format("Memory: Cargando datos en la posición %s %s.", position, data));
    }

    public void free() {
        System.out.println("Memory: Liberando memoria.");
    }
}
