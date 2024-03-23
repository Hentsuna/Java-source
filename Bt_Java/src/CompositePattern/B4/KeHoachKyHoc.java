package CompositePattern.B4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachKyHoc extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();

    public KeHoachKyHoc(String ten) {
        super(ten);
    }

    @Override
    public void add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public String getCTDT() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten)
                .append(";\t").append("Số tín chỉ:").append(soTC())
                .append(";\t").append("Học phí:").append(hocPhi());
        for (var a:list){
            a.p = this.p + "\t";
            builder.append("\n").append(a.p).append(a.getCTDT());
            a.p = "";
        }
        return builder.toString();
    }

    @Override
    public int soTC() {
        int tong = 0;
        for(var a: list){
            tong = tong + a.soTC();
        }
        return tong;
    }

    @Override
    public int hocPhi() {
        int tong = 0;
        for(var a:list){
            tong = tong + a.hocPhi();
        }
        return tong;
    }
}
