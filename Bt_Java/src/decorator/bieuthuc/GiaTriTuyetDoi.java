package decorator.bieuthuc;

public class GiaTriTuyetDoi extends BieuThucDecorator{

    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        return Math.abs(bieuThuc.giaTri());
    }

    @Override
    public String bieuThuc() {
        return "|" + String.valueOf(bieuThuc.giaTri()) + "|";
    }
}
