package devtalles.patrones.creacionales.e.singleton.devtalles;

import java.sql.SQLException;

/**
 * ! Singleton:
 * Es un patrón de diseño creacional que garantiza que una clase
 * tenga una única instancia y proporciona un punto de acceso global a ella.
 * <p>
 * * Es útil cuando necesitas controlar el acceso a una única instancia
 * * de una clase, como por ejemplo, en un objeto de base de datos o en un
 * * objeto de configuración.
 * <p>
 * https://refactoring.guru/es/design-patterns/singleton
 */

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection firstConnection = DatabaseConnection.getInstance();
        DatabaseConnection secondConnection = DatabaseConnection.getInstance();
        DatabaseConnection thirdConnection = DatabaseConnection.getInstance();


        System.out.println("firstConnection = " + firstConnection);
        System.out.println("secondConnection = " + secondConnection);
        System.out.println("thirdConnection = " + thirdConnection);
    }
}
