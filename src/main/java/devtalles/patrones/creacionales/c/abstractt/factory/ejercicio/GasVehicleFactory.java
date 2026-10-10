package devtalles.patrones.creacionales.c.abstractt.factory.ejercicio;

public class GasVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new GasVehicle();
    }

    @Override
    public Engine createEngine() {
        return new GasEngine();
    }
}
