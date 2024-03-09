package templace.cafe;

public abstract class CaffeineBeverage {
    StringBuilder builder = new StringBuilder();
    public void prepareRecipe(){
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
    }
    public void boilWater(){
        builder.append("\n")
                .append("Đổ nước nóng");
    }
    public void pourlnCup(){
        builder.append("\n")
                .append("Đổ ra ly");
    }
    abstract void brew();
    abstract void addCondiments();

    @Override
    public String toString() {
        return builder.toString();
    }
}
