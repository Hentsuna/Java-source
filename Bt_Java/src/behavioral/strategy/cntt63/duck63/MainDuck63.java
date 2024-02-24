package behavioral.strategy.cntt63.duck63;

public class MainDuck63 {
    public static void main(String[] args) {
        Duck63 d1 = new VitQuay();
        d1.setFlyable(new BayTrenLoThan());
        d1.setQuackable(new SQuack());
        d1.display();
    }
}
