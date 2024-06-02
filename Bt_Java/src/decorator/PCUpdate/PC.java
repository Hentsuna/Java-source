package decorator.PCUpdate;

public abstract class PC {
    String mainboard, CPU, RAM, storage, screen;
    int vMainboard, vCPU, vRAM, vStorage, vScreen;
    public abstract String build();
    public abstract int value();

    public String getMainboard() {
        return mainboard;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public int getvMainboard() {
        return vMainboard;
    }

    public int getvCPU() {
        return vCPU;
    }

    public int getvRAM() {
        return vRAM;
    }

    public int getvStorage() {
        return vStorage;
    }

    public int getvScreen() {
        return vScreen;
    }
}
