package decorator.PCUpdate;

public class ConcretePC extends PC{

    public ConcretePC(String mainboard, String CPU, String RAM, String storage, String screen, int vMainboard, int vCPU, int vRAM, int vStorage, int vScreen) {
        this.mainboard = mainboard;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.screen = screen;
        this.vMainboard = vMainboard;
        this.vCPU = vCPU;
        this.vRAM = vRAM;
        this.vStorage = vStorage;
        this.vScreen = vScreen;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append("Mainboard: " + mainboard + "\n")
                .append("RAM: " + RAM + "\n")
                .append("CPU: " + CPU + "\n")
                .append("Storage: " + storage + "\n")
                .append("Screen: " + screen);
        return builder.toString();
    }

    @Override
    public int value() {
        return vMainboard + vCPU + vRAM + vStorage + vScreen ;
    }
}
