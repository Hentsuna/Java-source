package decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe trung nguyên số 1");
        b = new Milk("Sữa cô gái Hà Lan", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b = new Milk("Sữa ông thọ", b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
