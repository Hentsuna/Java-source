package behavioral.strategy.cntt63.cc2_sapxep;

public class MainCC2 {
    public static void main(String[] args) {
        QLSinhVien sv = new QLSinhVien();
        sv.them(new SinhVien("Đàm Viết Trọng", "25112003", 8.5f));
        sv.them(new SinhVien("Nguyễn Hoàng Minh", "25092003", 9));
        sv.setSoSanh(new SoSanhTheoDiem()).sapXep();
        sv.inDS();
        sv.setSoSanh(new SoSanhTheoTen()).sapXep();
        sv.inDS();
    }
}
