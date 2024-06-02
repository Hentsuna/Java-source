package decorator.PCUpdate;

public class UpgradeRAM extends PCDecorator{
    String nRAM;
    int vnRAM;

    public UpgradeRAM(PC pc, String nRAM, int vnRAM) {
        super(pc);
        this.nRAM = nRAM;
        this.vnRAM = vnRAM;
    }

    @Override
    public String build() {
        StringBuilder builder = new StringBuilder();
        builder.append(pc.build());
        builder.append("\nRAM mới nâng cấp: ").append(nRAM);
        return builder.toString();
    }

    @Override
    public int value() {
        return pc.value() + vnRAM;
    }

    @Override
    public String getRAM() {
        return super.getRAM() + " " + nRAM;
    }

    @Override
    public int getvRAM() {
        return super.getvRAM() + vnRAM;
    }
}
