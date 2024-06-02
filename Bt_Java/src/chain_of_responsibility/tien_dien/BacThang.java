package chain_of_responsibility.tien_dien;

public abstract class BacThang {
    String mucSuDung, bac ;
    int max, min;
    int gia;

    public BacThang(String mucSuDung, String bac, int max, int min, int gia) {
        this.mucSuDung = mucSuDung;
        this.bac = bac;
        this.max = max;
        this.min = min;
        this.gia = gia;
    }

    public abstract int TinhTien(int soKW);
    public abstract BacThang ketiep(BacThang bt);
}
