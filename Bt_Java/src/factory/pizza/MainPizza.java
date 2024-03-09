package factory.pizza;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps = new PizzaStore() {
            @Override
            public Pizza createPizza(PizzaType p) {
                return new VN_HaiSanPizza();
            }
        };
        Pizza pizza = ps.orderPizza(PizzaType.HAISAN);
        System.out.println(pizza.toString());
    }
}
