package devtalles.patrones.estructurales.c.composite.ejercicio;

public class MenuItem implements MenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(String.format("%s - %s | price: %s", indent, this.name, this.price));
    }
}
