package org.example.taskPatterns;

public interface IComputerBuilder {
    IComputerBuilder setCPU(String cpu);
    IComputerBuilder setRAM(String ram);
    IComputerBuilder setStorage(String storage);
    IComputerBuilder setGPU(String gpu);
    Computer build();

}
