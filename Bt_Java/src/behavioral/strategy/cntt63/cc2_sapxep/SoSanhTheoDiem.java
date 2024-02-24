package behavioral.strategy.cntt63.cc2_sapxep;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        if(t1.diemTB > t2.diemTB){
            return 1;
        }
        if(t1.diemTB == t2.diemTB){
            return 0;
        }
        return -1;
    }
}
