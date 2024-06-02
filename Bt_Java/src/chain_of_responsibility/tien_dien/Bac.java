package chain_of_responsibility.tien_dien;

public class Bac extends BacThang{
    BacThang capCaoHon;
    public Bac(String mucSuDung, String bac, int max, int min, int gia) {
        super(mucSuDung, bac, max, min, gia);
    }

    @Override
    public int TinhTien(int soKW) {
        int tienDien = 0;
        if(soKW <= max)
        {
            tienDien = (soKW - min) * gia;
            return tienDien;
        }else
        {
            tienDien = (max - min) * gia;
           return tienDien + capCaoHon.TinhTien(soKW);
        }
    }

    @Override
    public BacThang ketiep(BacThang bt) {
        capCaoHon = bt;
        return capCaoHon;
    }
}
