package chain_of_responsibility.atm;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    ATM_TheoMenhGia m500, m200, m100, m50, m20, m10;

    public ChuoiMenhGiaVND() {
        m500 = new MenhGia(500000);
        m200 = new MenhGia(200000);
        m100 = new MenhGia(100000);
        m50 = new MenhGia(50000);
        m20 = new MenhGia(20000);
        m10 = new MenhGiaThapNhat(10000);
        m500.keTiep(m200).keTiep(m100).keTiep(m50).keTiep(m20).keTiep(m10);
    }

    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        switch (menhGia){
            case 500000: return m500;
            case 200000: return m200;
            case 100000: return m100;
            case 50000: return m50;
            case 20000: return m20;
            case 10000: return m10;
        }
        return null;
    }
}
