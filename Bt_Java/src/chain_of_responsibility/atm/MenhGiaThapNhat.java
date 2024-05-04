package chain_of_responsibility.atm;

public class MenhGiaThapNhat extends ATM_TheoMenhGia{
    public MenhGiaThapNhat(int menhGia) {
        super(menhGia);
    }

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        //Tinh so to tien va in ra so to
        int soTo = soTien/ menhGia;
        if(soTo > 0)
            System.out.println(soTo + " tờ " + menhGia);
    }
}
