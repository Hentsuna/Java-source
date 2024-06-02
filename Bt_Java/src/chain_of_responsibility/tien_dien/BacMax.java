package chain_of_responsibility.tien_dien;

public class BacMax extends BacThang{
    public BacMax(String mucSuDung, String bac, int max, int min, int gia) {
        super(mucSuDung, bac, max, min, gia);
    }

    @Override
    public int TinhTien(int soKW) {
        return (soKW - min) * gia;
    }

    @Override
    public BacThang ketiep(BacThang bt) {
        return null;
    }
}
