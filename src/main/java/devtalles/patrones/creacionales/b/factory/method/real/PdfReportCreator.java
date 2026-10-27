package devtalles.patrones.creacionales.b.factory.method.real;

public class PdfReportCreator extends ReporCreatortService {
    @Override
    protected Report crearReport() {
        return new PdfReport();
    }
}
