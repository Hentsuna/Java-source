package chain_of_responsibility.f88;

public class ChuTich extends NhanVienF88{
    public ChuTich(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= hanMucDuyetVay)
            System.out.println("Chủ tịch duyệt mức vay " + soTienVay);
        else System.out.println("Ra Eximbank vay");
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        return null;
    }
}
