package observer_pattern.ATM;

public class ATM1 {
    TaiKhoanATM theATM;
    public void nhanThe(TaiKhoanATM theATM){
        this.theATM = theATM;
    }
    public void traThe(TaiKhoanATM theATM){
        this.theATM = null;
    }
    public void rutTien(int soTien){
        if(theATM != null){
            if(theATM.kiemTraSoDu(soTien) == true)
                theATM.nhanThongBao(soTien, true);
            else theATM.nhanThongBao(soTien, false);
        }
        else System.out.println("Không có thẻ");
    }
    public static interface TaiKhoanATM{
        boolean kiemTraSoDu(int soTien);
        void nhanThongBao(int soTienRut, boolean thanhCong);
    }
}
