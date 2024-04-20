package template.online;

public class MySinhVien {
    private int msSV;
    private String tenSV, ngaySinh, queQuan;

    public MySinhVien(int msSV, String tenSV, String ngaySinh, String queQuan) {
        this.msSV = msSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public int getMsSV() {
        return msSV;
    }

    public void setMsSV(int msSV) {
        this.msSV = msSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
