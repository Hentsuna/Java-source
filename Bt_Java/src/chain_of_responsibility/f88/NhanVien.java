package chain_of_responsibility.f88;

public class NhanVien extends NhanVienF88{
    public NhanVien(String ten, String chucVu, int hanMucDuyetVay) {
        super(ten, chucVu, hanMucDuyetVay);
    }
    NhanVienF88 capCaoHon;

    @Override
    public void duyetKhoanVay(int soTienVay) {
        if(soTienVay <= hanMucDuyetVay)
            System.out.println(chucVu + " " + ten + " duyệt mức vay " + soTienVay);
        else capCaoHon.duyetKhoanVay(soTienVay);
    }

    @Override
    public NhanVienF88 capTren(NhanVienF88 nv) {
        capCaoHon = nv;
        return capCaoHon;
    }
}
