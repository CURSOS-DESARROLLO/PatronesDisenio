package devtalles.patrones.creacionales.a.builder;

import devtalles.patrones.creacionales.a.builder.devtalles.Computer;
import devtalles.patrones.creacionales.a.builder.devtalles.ComputerBuilder;
import devtalles.patrones.creacionales.a.builder.ejercicio.QueryBuilder;


public class Main {
    public static void main(String[] args) {
        //! devtalles. adaptado de ts a java
        Computer computer = new ComputerBuilder()
                .setCpu("Intel Celeron")
                .setRam("8GB")
                .setRam("16GB")
                .setStorage("256GB")
                .build();

        saltosLinea();
        System.out.println(computer);
        saltosLinea();


        //! segun la ia, debería ser Builder una clase anidada
        // ya que la clase computer de arriba, aun podria instanciarse individualmente, es decir, mutable y fuera de los metodos anidados, no tendria caso la clase Builder.
        devtalles.patrones.creacionales.a.builder.ia.Computer computerIA =
                devtalles.patrones.creacionales.a.builder.ia.Computer.builder()
                        .setCpu("Ryzen 7")
                        .setRam("32 GB")
                        .setStorage("1 TB SSD")
                        .setGpu("RTX 4060")
                        .build();

        // * esto ya no es posible. ahora se deberia usar el builder
        // devtalles.patrones.creacionales.a.builder.ia.Computer comp = new devtalles.patrones.creacionales.a.builder.ia.Computer();

        System.out.println(computerIA);
        saltosLinea();

        // !TAREA
        QueryBuilder query = QueryBuilder.builder("PERSONAS")
                .select("ID", "NOMBRE", "APELLIDO_PATERNO", "FECHA_NACIMIENTO")
                .where("YEAR(FECHA_NACIMIENTO) = 2002")
                .where("NAME LIKE '%ETO'")
                .orderBy("NOMBRE ASC")
                .orderBy("ID DESC")
                .limit(12)
                .execute();

        System.out.println(query);
    }

    private static void saltosLinea() {
        System.out.println("\n\n\n");
    }
}
