package devtalles.patrones.estructurales.c.composite.devtalles;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> contents;

    public Folder(String name) {
        this.name = name;
        this.contents = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        this.contents.add(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(String.format("%s + Carpeta: %s", indent, this.name));
        this.contents.forEach(component -> component.showDetails(" "));
    }
}
