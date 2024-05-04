package chain_of_responsibility.atm;

public class Main {
    public static void main(String[] args) {
//        ATM_TheoMenhGia mg1 = new MenhGia(500000);
//        ATM_TheoMenhGia mg2 = new MenhGia(200000);
//        ATM_TheoMenhGia mg3 = new MenhGia(100000);
//        ATM_TheoMenhGia mg4 = new MenhGia(50000);
//        ATM_TheoMenhGia mg5 = new MenhGia(20000);
//        ATM_TheoMenhGia mg6 = new MenhGiaThapNhat(10000);
//        mg1.keTiep(mg2).keTiep(mg3).keTiep(mg4).keTiep(mg5).keTiep(mg6);
//        mg1.rutTien(2930000);
        ChuoiMenhGiaFactory cmg = new ChuoiMenhGiaVND();
        cmg.rutTien(19300000, 200000);
    }
}
