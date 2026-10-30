package devtalles.patrones.estructurales.e.facade.ejercicio;

public class Cpu {
    public void stopOperations() {
        System.out.println("CPU: Deteniendo operaciones.");
    }

    public void jump(int position) {
        System.out.println(String.format("CPU: Saltando a la posición de memoria %s.", position));
    }

    public void execute() {
        System.out.println("CPU: Ejecutando instrucciones.");
    }
}
