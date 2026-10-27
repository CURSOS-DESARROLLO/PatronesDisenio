package devtalles.patrones.creacionales.b.factory.method.real;

public class ExcelReportCreator extends ReporCreatortService {
    @Override
    protected Report crearReport() {
        return new ExcelReport();
    }
}
