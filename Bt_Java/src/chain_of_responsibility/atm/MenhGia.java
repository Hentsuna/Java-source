package chain_of_responsibility.atm;

public class MenhGia extends ATM_TheoMenhGia{
    public MenhGia(int menhGia) {
        super(menhGia);
    }
    ATM_TheoMenhGia keTiep;

    @Override
    public ATM_TheoMenhGia keTiep(ATM_TheoMenhGia k) {
        keTiep = k;
        return keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / menhGia;
        int soDu = soTien % menhGia;
        if(soTo > 0 ) System.out.println(soTo + " tờ " + menhGia);
        keTiep.rutTien(soDu);
    }

}
