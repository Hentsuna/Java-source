package CompositePattern.B4;

public class MonHoc extends KeHoachHocTap{
    int soTC, hocPhi;

    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(KeHoachHocTap k) {

    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t").append("Số tín chỉ:").append(soTC())
                .append(";\t").append("Học phí:").append(hocPhi());
        return builder.toString();
    }

    @Override
    public int soTC() {
        return this.soTC;
    }

    @Override
    public int hocPhi() {
        return hocPhi * soTC;
    }
}
