package decorator.PCUpdate;

public class MainPC {
    public static void main(String[] args) {
        PC pc = new ConcretePC("Intel", "i5", "16GB", "256GB", "FullHD", 100000, 100000, 50000, 70000, 20000);
        System.out.println(pc.build());
        System.out.println(pc.value() + "\n");
        PC ramUp = new UpgradeRAM(pc, "32GB", 100000);
        System.out.println(ramUp.build());
        System.out.println(ramUp.value());
        PC cpuUp = new UpgradeCPU(ramUp, "i9", 300000);
        System.out.println(cpuUp.build());
        System.out.println(cpuUp.value());
    }
}
