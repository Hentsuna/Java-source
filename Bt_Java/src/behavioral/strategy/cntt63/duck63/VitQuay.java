package behavioral.strategy.cntt63.duck63;

public class VitQuay extends Duck63{
    @Override
    public void display() {
        System.out.println("Vịt quay!");
        performFly();
        performQuack();
        System.out.println("Itadakimasu");
    }
}
