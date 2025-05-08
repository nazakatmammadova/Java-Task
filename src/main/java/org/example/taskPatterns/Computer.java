package org.example.taskPatterns;

public abstract class Computer {
    protected String type;
    protected String cpu;
    protected String ram;
    protected String storage;
    protected String gpu;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
