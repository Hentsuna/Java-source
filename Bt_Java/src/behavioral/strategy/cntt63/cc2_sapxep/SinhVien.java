package behavioral.strategy.cntt63.cc2_sapxep;

import java.util.Date;

public class SinhVien {
    public String hoTen;
    public String ngaySinh;
    public float diemTB;

    public SinhVien(String hoTen, String ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Họ và tên: " + hoTen + "\n" +
                "Ngày: " + ngaySinh + "\n" +
                "Điêm TB: " + diemTB + "\n";
    }
}
