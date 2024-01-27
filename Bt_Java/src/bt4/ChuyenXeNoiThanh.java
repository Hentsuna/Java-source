package bt4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    int soTuyen, soKM;

    public ChuyenXeNoiThanh(String maSo, String taiXe, String soXe, int doanhThu, int soTuyen, int soKM) {
        super(maSo, taiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh{" +
                "soTuyen=" + soTuyen +
                ", soKM=" + soKM +
                ", maSo='" + maSo + '\'' +
                ", taiXe='" + taiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }
}
