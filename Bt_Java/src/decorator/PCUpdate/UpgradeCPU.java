package decorator.PCUpdate;

public class UpgradeCPU extends PCDecorator{
    String nCPU;
    int vnCPU;

    public UpgradeCPU(PC pc, String nCPU, int vnCPU) {
        super(pc);
        this.nCPU = nCPU;
        this.vnCPU = vnCPU;
    }

    @Override
    public String build() {
        return "";
    }

    @Override
    public int value() {
        return pc.value() - super.getvCPU() + vnCPU;
    }

    @Override
    public String getCPU() {
        return nCPU;
    }

    @Override
    public int getvCPU() {
        return vnCPU;
    }

}
