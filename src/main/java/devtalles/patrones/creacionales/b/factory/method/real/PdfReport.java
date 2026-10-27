package devtalles.patrones.creacionales.b.factory.method.real;

public class PdfReport implements Report {
    @Override
    public void createBaseDocument() {
        System.out.println("Creando Base Document PDF");
    }

    @Override
    public void createHeaderDocument() {
        System.out.println("Creando Header PDF");
    }

    @Override
    public void createBodyDocument() {
        System.out.println("Creando Body PDF");
    }

    @Override
    public void createFooterDocument() {
        System.out.println("Creando Footer PDF");
    }

    @Override
    public void saveDocument() throws ReportSaveException {
        System.out.println("Salvando Base Document PDF");
    }
}
