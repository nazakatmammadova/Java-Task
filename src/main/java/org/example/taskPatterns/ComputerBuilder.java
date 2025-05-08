package org.example.taskPatterns;

public class ComputerBuilder implements IComputerBuilder {
    private final Computer computer;

    public ComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public IComputerBuilder setCPU(String cpu) {
        computer.setCPU(cpu);
        return this;
    }

    @Override
    public IComputerBuilder setRAM(String ram) {
        computer.setRAM(ram);
        return this;
    }

    @Override
    public IComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    @Override
    public IComputerBuilder setGPU(String gpu) {
        computer.setGPU(gpu);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}

