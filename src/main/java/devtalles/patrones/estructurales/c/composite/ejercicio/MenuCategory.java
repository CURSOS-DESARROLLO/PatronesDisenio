package devtalles.patrones.estructurales.c.composite.ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuCategory implements MenuComponent {
    private String name;
    private List<MenuComponent> content;

    public MenuCategory(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void add(MenuComponent menuComponent) {
        this.content.add(menuComponent);
    }

    public void add(MenuComponent... menuComponent) {
        this.content.addAll(Arrays.asList(menuComponent));
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(String.format("%s + %s", indent, this.name));
        this.content.forEach(item -> item.showDetails(indent + " "));
    }
}
