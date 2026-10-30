package devtalles.patrones.estructurales.e.facade.ejercicio;

public class HardDrive {
    public String read(int position, int size) {
        System.out.println(String.format("HardDrive: Leyendo %s bytes desde la posición %s.", position, size));

        return "001010001010100";
    }

    public void close() {
        System.out.println("HardDrive: Deteniendo disco duro.");
    }
}
