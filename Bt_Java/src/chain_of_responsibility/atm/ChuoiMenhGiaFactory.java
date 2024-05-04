package chain_of_responsibility.atm;

public abstract class ChuoiMenhGiaFactory {
    public abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);
    public void rutTien(int soTien, int menhGiaCaoNhat){
        ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
        if(chuoiMenhGia!=null)
            chuoiMenhGia.rutTien(soTien);
        else System.out.println("Chọn lại mênh giá cao nhất!");
    }
}
