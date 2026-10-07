package devtalles.patrones.creacionales.a.builder.devtalles;

public class ComputerBuilder {
    private Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder setCpu(String cpu) {
        this.computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        this.computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.computer.setGpu(gpu);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
