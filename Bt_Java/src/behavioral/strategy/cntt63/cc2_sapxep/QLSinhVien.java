package behavioral.strategy.cntt63.cc2_sapxep;

import java.util.ArrayList;
import java.util.List;

public class QLSinhVien {
    ISoSanh soSanh;
    List<SinhVien> list = new ArrayList<>();

    public QLSinhVien setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }
    public void them(SinhVien sv){
        list.add(sv);
    }

    public void sapXep(){
        for(int i=0; i<list.size()-1; i++)
            for (int j = 0; j < list.size(); j++) {
                if(soSanh.soSanh(list.get(i), list.get(j))>0){
                    SinhVien s = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,s);
                }
            }
    }
    public void inDS(){
        for (SinhVien s:list) {
            System.out.println(s.toString());
        }
    }
}
