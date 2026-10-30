package devtalles.patrones.estructurales.e.facade;

import devtalles.patrones.estructurales.e.facade.devtalles.*;
import devtalles.patrones.estructurales.e.facade.ejercicio.ComputerFacade;
import devtalles.patrones.estructurales.e.facade.ejercicio.Cpu;
import devtalles.patrones.estructurales.e.facade.ejercicio.HardDrive;
import devtalles.patrones.estructurales.e.facade.ejercicio.Memory;
import devtalles.patrones.util.Spacing;

/**
 * ! Patrón Facade
 * Este patrón proporciona una interfaz unificada para un conjunto de interfaces
 * en un subsistema.
 * <p>
 * Facade define una interfaz de nivel más alto que hace que el subsistema
 * sea más fácil de usar.
 * <p>
 * * Es útil cuando un subsistema es complejo o difícil de entender para
 * * proporcionar una interfaz simplificada para el cliente.
 * <p>
 * https://refactoring.guru/es/design-patterns/facade
 */

public class Main {
    public static void main(String[] args) {
        // en este caso, Teatro en casa tiene toda una ejecución / configuración
        // para comenzar a ver una pelicula.
        // he aquí su utilidad. Ya que
        TeatroCasaFacade teatroCasaFacade = new TeatroCasaFacade(
                new Proyector(),
                new ReproductorVideo(),
                new SistemaSonido(),
                new MaquinaPalomitas()
        );

        teatroCasaFacade.comenzarFuncion();
        Spacing.generarEspacio();
        teatroCasaFacade.terminarFuncion();

        Spacing.generarEspacio();
        Spacing.generarEspacio();

        ComputerFacade computerFacade = new ComputerFacade(
                new Cpu(),
                new HardDrive(),
                new Memory()
        );

        computerFacade.startComputer();
        Spacing.generarEspacio();
        computerFacade.shutdownComputer();
    }
}
