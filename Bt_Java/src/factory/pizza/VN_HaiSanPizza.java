package factory.pizza;

public class VN_HaiSanPizza extends Pizza{

    @Override
    void prepare() {
        builder.append("Bột, cá, tôm, mực");
    }

    @Override
    void bake() {
        builder.append("\n")
                .append("Nướng");
    }

    @Override
    void cut() {
        builder.append("\n")
                .append("Cắt 8 miếng");
    }

    @Override
    void box() {
        builder.append("\n")
                .append("Bỏ hộp");
    }
}
