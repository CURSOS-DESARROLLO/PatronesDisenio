package devtalles.patrones.estructurales.e.facade.ejercicio;

public class ComputerFacade {
    private Cpu cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade(Cpu cpu, HardDrive hardDrive, Memory memory) {
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public void startComputer() {
        System.out.println("Iniciando la computadora...");
        this.memory.load(0, this.hardDrive.read(0, 1024));
        this.cpu.jump(0);
        cpu.execute();
        System.out.println("Computadora lista para usar.");
    }

    public void shutdownComputer() {
        System.out.println("Apagando la computadora...");
        this.memory.free();
        this.hardDrive.close();
        this.cpu.stopOperations();
        System.out.println("Computadora apagada.");
    }
}
