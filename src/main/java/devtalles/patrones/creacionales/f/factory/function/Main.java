package devtalles.patrones.creacionales.f.factory.function;

import java.util.function.Function;

/**
 * ! Factory Function
 * Es un patrón de diseño que nos permite crear objetos o funciones de manera dinámica que serán
 * usados posteriormente en el código.
 * <p>
 * * Es útil cuando necesitamos crear objetos o funciones de manera dinámica,
 * * es decir, en tiempo de ejecución y no en tiempo de compilación.
 * <p>
 * una función que fabrica y devuelve otras funciones, dependiendo del parámetro recibido.
 *
 */

public class Main {
    public static void main(String[] args) {
        Function<String, Function<String, String>> LogFactoryFunction = type -> switch (type) {
            case "info" -> message -> String.format("INFO: %s", message);
            case "warning" -> message -> String.format("WARNING: %s", message);
            case "error" -> message -> String.format("ERROR: %s", message);
            default -> message -> String.format("NORMAL: %s", message);
        };


        Function<String, String> normalLog = LogFactoryFunction.apply("");
        Function<String, String> warningLog = LogFactoryFunction.apply("warning");
        Function<String, String> ErrorLog = LogFactoryFunction.apply("error");
        Function<String, String> InfoLog = LogFactoryFunction.apply("info");


        System.out.println(normalLog.apply("Creando base de datos..."));
        System.out.println(normalLog.apply("Estableciendo conexión..."));
        System.out.println(InfoLog.apply("Conexión establecida..."));
        System.out.println(InfoLog.apply("Creando tablas..."));
        System.out.println(ErrorLog.apply("Tablas no existen..."));
        System.out.println(normalLog.apply("Intentando crear tablas..."));
        System.out.println(InfoLog.apply("Tablas creadas..."));
        System.out.println(warningLog.apply("Todo listo, tenga cuidado, ya que todo esta preparado para producción..."));
    }
}
