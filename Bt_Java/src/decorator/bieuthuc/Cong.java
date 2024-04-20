package decorator.bieuthuc;

public class Cong extends BieuThucDecorator{
    private float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(bieuThuc.giaTri()) + "+" + String.valueOf(toanHang);
    }

//    @Override
//    public String toString() {
//        return bieuThuc.giaTri() + "=" + giaTri();
//    }
}
