package devtalles.patrones.estructurales.c.composite.devtalles;

import devtalles.patrones.estructurales.c.composite.ejercicio.MenuCategory;
import devtalles.patrones.estructurales.c.composite.ejercicio.MenuComponent;
import devtalles.patrones.estructurales.c.composite.ejercicio.MenuItem;
import devtalles.patrones.util.Spacing;
import jdk.jfr.Category;

/**
 * ! Patrón Composite
 * Es un patrón de diseño estructural que permite componer objetos
 * en estructuras de árbol para representar jerarquías.
 * <p>
 * El patrón permite a los clientes tratar de manera uniforme a los objetos
 * individuales y a sus composiciones.
 * <p>
 * * Es útil cuando necesitas tratar a los objetos individuales
 * * y a sus composiciones de manera uniforme, y la estructura
 * * de los objetos forma una jerarquía en árbol.
 * <p>
 * https://refactoring.guru/es/design-patterns/composite
 *
 */

public class Main {
    public static void main(String[] args) {
        //! Devtalles
        File file1 = new File("Archivo_1.txt");
        File file2 = new File("Archivo_2.txt");
        File file3 = new File("Archivo_3.txt");
        File file4 = new File("Archivo_4.txt");
        File file5 = new File("Archivo_5.txt");

        Folder folder1 = new Folder("Descargas");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Archivos");
        folder2.add(file3);

        Folder folder3 = new Folder("Devtalles");
        folder3.add(file4);
        folder3.add(file5);

        folder2.add(folder3);


        Folder root = new Folder("Root");
        root.add(folder1);
        root.add(folder2);


        root.showDetails("");


        Spacing.generarEspacio();
        Spacing.generarEspacio();


        //! Ejercicio
        MenuItem soda = new MenuItem("Refresco", 2.87);
        MenuItem sodaItaliana = new MenuItem("Soda italiana", 4.55);
        MenuItem coffe = new MenuItem("Café", 6.13);
        MenuItem salad = new MenuItem("Ensalada", 5.99);
        MenuItem soup = new MenuItem("Sopa de tomate", 5.99);
        MenuItem steak = new MenuItem("Bistec", 15.99);
        MenuItem dessert = new MenuItem("Pastel de chocolate", 6.13);
        MenuItem hamburguer = new MenuItem("Hamburguesa", 6.13);


        //! Saludables
        MenuCategory bebidaSaludableCategory = new MenuCategory("Bebidas Saludables");
        bebidaSaludableCategory.add(coffe);

        MenuCategory alimentoSaludableCatetory = new MenuCategory("Alimentos Saludables");
        alimentoSaludableCatetory.add(salad);
        alimentoSaludableCatetory.add(soup);
        alimentoSaludableCatetory.add(steak);


        //! comida rápida
        MenuCategory bebidaRapidaCategory = new MenuCategory("Bebidas Rapidas");
        bebidaRapidaCategory.add(soda);
        bebidaRapidaCategory.add(sodaItaliana);

        MenuCategory alimentoRapidoCatetory = new MenuCategory("Alimentos Rapidos");
        alimentoRapidoCatetory.add(dessert);
        alimentoRapidoCatetory.add(hamburguer);


        MenuCategory menuSaludable = new MenuCategory("Saludable");
        menuSaludable.add(bebidaSaludableCategory);
        menuSaludable.add(alimentoSaludableCatetory);


        MenuCategory menuRapido = new MenuCategory("Comida Rápida");
        menuRapido.add(bebidaRapidaCategory);
        menuRapido.add(alimentoRapidoCatetory);

        // ! menu principal
        MenuCategory rootMenu = new MenuCategory("Menú principal");
        rootMenu.add(menuSaludable);
        rootMenu.add(menuRapido);

        rootMenu.showDetails("");

        // lo interesante de este patron son las listas de tipo interface, que hace que show details se haga de manera recursiva, siendo en este caso MenuCompontent
        // al tener un List<MenuCompontent> permite que se agregue un menuItem o MenuCategory. pues ambas son implementaciones de la interface.

    }
}
