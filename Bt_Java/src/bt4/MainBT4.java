package bt4;

public class MainBT4 {
    public static void main(String[] args) {
        QuanLyChuyenXe quanly = new QuanLyChuyenXe();
        quanly.them(new ChuyenXeNgoaiThanh("TS1", "Trọng", "AB665", 100000, "Tuy Hoà", 1));
        quanly.them(new ChuyenXeNoiThanh("NA1", "Minh", "BA678", 50000, 2, 5));
        quanly.them(new ChuyenXeNoiThanh("NA2", "Tùng", "BB678", 30000, 2, 5));
        quanly.inDS();
        System.out.println("Doanh thu xe nội thành:" + quanly.doanhThuXeNoiThanh());
        System.out.println("Doanh thu xe ngoại thành:" + quanly.doanhThuXeNgoaiThanh());
        System.out.println("Tổng doanh thu xe:" + quanly.tongDoanhThu());

    }
}
