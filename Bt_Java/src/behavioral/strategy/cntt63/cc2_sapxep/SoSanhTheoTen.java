package behavioral.strategy.cntt63.cc2_sapxep;

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien t1, SinhVien t2) {
        return t1.hoTen.compareTo(t2.hoTen);
    }
}
