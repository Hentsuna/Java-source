package builder.A1;

import singleton.A6.SanPham;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader header;
    List<CTHD> cthds;
    private HoaDon(Builder b){
        this.cthds = b.cthds;
        this.header = b.header;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "header=" + header +
                ", cthds=" + cthds +
                '}';
    }

    public static class Builder{
            HoaDonHeader header;
            List<CTHD> cthds = new ArrayList<>();

            public Builder setHeader(String maHD, String ngayban, String khachhang) {
                header = new HoaDonHeader(maHD, ngayban, khachhang);
                return this;
            }

            public Builder addCTHD(String sanpham, int solg, int dongia, float chietkhau) {
                cthds.add(new CTHD(sanpham, solg, dongia, chietkhau));
                return this;
            }
            public HoaDon build(){
                return new HoaDon(this);
            }

    }
}
