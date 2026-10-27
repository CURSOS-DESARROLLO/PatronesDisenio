package devtalles.patrones.creacionales.b.factory.method.real;

import java.io.File;

public class ExcelReport implements Report {
    @Override
    public void createBaseDocument() {
        System.out.println("Creando base document en un formato excel");
    }

    @Override
    public void createHeaderDocument() {
        System.out.println("Creando header document en un formato excel");
    }

    @Override
    public void createBodyDocument() {
        System.out.println("Creando body document en un formato excel");
    }

    @Override
    public void createFooterDocument() {
        System.out.println("Creando footer document en un formato excel");
    }

    @Override
    public void saveDocument() throws ReportSaveException {
        System.out.println("Saving document");

        // en un contexto real puedo arrojar una excepcion personalizada si la libreria para guardar exceles puede arrojar una excepcion de su propio tipo
    }
}
