package templace.cafe;

public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        builder.append("\n")
                .append("Pha trà");
    }

    @Override
    void addCondiments() {
        builder.append("\n")
                .append("Thêm chanh");
    }
}
