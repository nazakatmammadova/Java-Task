package org.example.taskPatterns;

public class ComputerFactory {
    public static Computer createComputer(String type) {
        return switch (type.toLowerCase()) {
            case "laptop" -> new Laptop();
            case "desktop" -> new Desktop();
            case "server" -> new Server();
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}
