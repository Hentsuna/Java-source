package bt4;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {
    List<ChuyenXe> dsChuyenXe = new ArrayList<>();
    void them(ChuyenXe cx) {dsChuyenXe.add(cx);}
    void inDS(){
        for(ChuyenXe cx:dsChuyenXe)
            System.out.println(cx.toString());
    }
    int doanhThuXeNoiThanh(){
        int tong = 0;
        for(ChuyenXe cx:dsChuyenXe)
            if(cx instanceof ChuyenXeNoiThanh)
                tong += cx.doanhThu;
        return tong;
    }
    int doanhThuXeNgoaiThanh(){
        int tong = 0;
        for(ChuyenXe cx:dsChuyenXe)
            if(cx instanceof ChuyenXeNgoaiThanh)
                tong += cx.doanhThu;
        return  tong;
    }

    int tongDoanhThu(){
        int tong = 0;
        tong = doanhThuXeNoiThanh() +doanhThuXeNgoaiThanh();
        return tong;
    }
}
