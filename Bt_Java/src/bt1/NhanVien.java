package bt1;

public class NhanVien {
    String ten, diaChi;
    double tienLuong;
    int tuoi, tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, String diaChi, double tienLuong, int tuoi, int tongSoGioLam) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tuoi = tuoi;
        this.tongSoGioLam = tongSoGioLam;
    }

    public double tinhThuong(){
        if(tongSoGioLam >= 200) return tienLuong*0.2;
        if(tongSoGioLam >= 100) return tienLuong*0.1;
        return 0;
    }

    @Override
    public String toString() {
        return "Tên:" + ten + "\n" +
                "Tuổi:" + tuoi + "\n" +
                "Địa Chỉ:" + diaChi + "\n" +
                "Tiền Lương:" + tienLuong + "\n" +
                "Tổng số giờ làm:" + tongSoGioLam + "\n";
    }

    //Get set
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
}
