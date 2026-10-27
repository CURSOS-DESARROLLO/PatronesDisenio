package devtalles.patrones.creacionales.b.factory.method.real;

public abstract class ReporCreatortService {
    protected abstract Report crearReport();

    public void ejecutarGeneracionReport() {
        try {
            Report report = this.crearReport();
            report.createBaseDocument();
            report.createHeaderDocument();
            report.createBodyDocument();
            report.createFooterDocument();
            report.saveDocument();
        } catch (ReportSaveException e) {
            System.out.println(e.getMessage());
        }
    }
}
