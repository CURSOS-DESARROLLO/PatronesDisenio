package devtalles.patrones.creacionales.c.abstractt.factory.ejercicio;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new ElectricVehicle();
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}
