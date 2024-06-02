package decorator.PCUpdate;

public abstract class PCDecorator extends PC{
    PC pc;

    public PCDecorator(PC pc) {
        this.pc = pc;
    }

    @Override
    public String getMainboard() {
        return pc.getMainboard();
    }

    @Override
    public String getCPU() {
        return pc.getCPU();
    }

    @Override
    public String getRAM() {
        return pc.getRAM();
    }

    @Override
    public String getStorage() {
        return pc.getStorage();
    }

    @Override
    public String getScreen() {
        return pc.getScreen();
    }

    @Override
    public int getvMainboard() {
        return pc.getvMainboard();
    }

    @Override
    public int getvCPU() {
        return pc.getvCPU();
    }

    @Override
    public int getvRAM() {
        return pc.getvRAM();
    }

    @Override
    public int getvStorage() {
        return pc.getvStorage();
    }

    @Override
    public int getvScreen() {
        return pc.getvScreen();
    }
}
