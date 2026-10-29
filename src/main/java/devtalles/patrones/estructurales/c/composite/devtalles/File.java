package devtalles.patrones.estructurales.c.composite.devtalles;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(String.format("%s - Archivo: %s", indent, this.name));
    }
}
