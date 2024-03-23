package CompositePattern.B4;

public abstract class KeHoachHocTap {
    String ten;
    String p = "";

    public KeHoachHocTap(String ten) {
        this.ten = ten;
    }

    public abstract void add(KeHoachHocTap k);
    public abstract void remove(KeHoachHocTap k);
    public abstract String getCTDT();
    public abstract int soTC();
    public abstract int hocPhi();
}
