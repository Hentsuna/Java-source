package bt4;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;

    public ChuyenXeNgoaiThanh(String maSo, String taiXe, String soXe, int doanhThu, String noiDen, int soNgay) {
        super(maSo, taiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh{" +
                "noiDen='" + noiDen + '\'' +
                ", soNgay=" + soNgay +
                ", maSo='" + maSo + '\'' +
                ", taiXe='" + taiXe + '\'' +
                ", soXe='" + soXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
}
