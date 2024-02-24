package behavioral.strategy.cntt63.duck63;

public class VitTroi extends Duck63{
    @Override
    public void display() {
        System.out.println("Vịt trời");
        performFly();
        performQuack();
        System.out.println("Đang bay");
    }
}
