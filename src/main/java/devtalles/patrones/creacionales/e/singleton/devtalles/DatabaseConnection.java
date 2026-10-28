package devtalles.patrones.creacionales.e.singleton.devtalles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {
    private static final String URL = "";
    private static final String USER = "";
    private static final String PASSWORD = "";
    private Connection connection;

    private static DatabaseConnection instance;

    private DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
    }

    public static synchronized DatabaseConnection getInstance() throws SQLException {
        if (instance == null || instance.connection == null || instance.connection.isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
