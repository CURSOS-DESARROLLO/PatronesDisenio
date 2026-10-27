package devtalles.patrones.creacionales.b.factory.method.real;

public interface Report {
    void createBaseDocument();

    void createHeaderDocument();

    void createBodyDocument();

    void createFooterDocument();

    void saveDocument() throws ReportSaveException;
}
