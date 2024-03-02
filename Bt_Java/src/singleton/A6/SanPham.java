package singleton.A6;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int solg;
    private double dongia;

    public SanPham(String maSP, String tenSP, int solg, double dongia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.solg = solg;
        this.dongia = dongia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
}
