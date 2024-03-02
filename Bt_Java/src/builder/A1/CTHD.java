package builder.A1;

public class CTHD {
    String sanpham;
    int solg, dongia;
    float chietkhau;

    public CTHD(String sanpham, int solg, int dongia, float chietkhau) {
        this.sanpham = sanpham;
        this.solg = solg;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }

    @Override
    public String toString() {
        return "CTHD{" +
                "sanpham='" + sanpham + '\'' +
                ", solg=" + solg +
                ", dongia=" + dongia +
                ", chietkhau=" + chietkhau +
                '}';
    }
}
