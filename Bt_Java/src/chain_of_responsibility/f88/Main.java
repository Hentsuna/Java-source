package chain_of_responsibility.f88;

public class Main {
    public static void main(String[] args) {
        NhanVienF88 bv = new NhanVien("Minh", "bảo vệ", 1000000);
        NhanVienF88 nv = new NhanVien("Tùng", "Nhân viên quèn", 10000000);
        NhanVienF88 gd = new NhanVien("Chánh", "Giám đốc", 50000000);
        NhanVienF88 ct = new ChuTich("Trọng", "Chủ tịch", 100000000);
        bv.capTren(nv).capTren(gd).capTren(ct);
        bv.duyetKhoanVay(200000000);
    }
}
