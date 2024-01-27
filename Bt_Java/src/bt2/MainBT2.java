package bt2;

import bt1.NhanVien;

public class MainBT2 {
    public static void main(String[] args) {
        IQuanLy quanLy = new QuanLyNhanVien();
//        NhanVien nv1 = new NhanVien("Trọng", "Tuy Hoà", 10, 20, 215);
//        NhanVien nv2 = new NhanVien("Tùng", "Tuy Hoà", 10, 20, 215);
        quanLy.them(new NhanVien("Trọng", "Tuy Hoà", 10, 20, 215));
        quanLy.them(new NhanVien("Tùng", "Tuy Hoà", 10, 20, 215));
        quanLy.inDS();
    }
}
