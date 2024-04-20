package template.cafe;

public class MainCafe {
    public static void main(String[] args) {
        CaffeineBeverage cafe = new Coffee();
        cafe.prepareRecipe();
        CaffeineBeverage tra = new Tea();
        tra.prepareRecipe();
        System.out.println(tra);
    }
}
