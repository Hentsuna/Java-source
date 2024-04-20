package decorator.tokennize;

public class MainTokennize {
    public static void main(String[] args) {
        Tokennize t = new TachTu("Lễ được nghỉ bốn ngày, Minh rủ đi chơi!");
        System.out.println(t.tokennize());
        t = new RemoveStopword(t);
        System.out.println(t.tokennize());
        t = new RemovePunchtuation(t);
        System.out.println(t.tokennize());
    }
}
