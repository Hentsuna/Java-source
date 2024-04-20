package decorator.bieuthuc;

public class Tru extends BieuThucDecorator{
    private float toanHang;

    public Tru(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(bieuThuc.giaTri()) + "-" + String.valueOf(toanHang);
    }
}
