package observer_pattern.ATM;

public class TaiKhoan1 implements ATM1.TaiKhoanATM {
    String tenTK;
    int soDu;
    ATM1 atm;

    public TaiKhoan1(String tenTK, int soDu, ATM1 atm) {
        this.tenTK = tenTK;
        this.soDu = soDu;
        this.atm = atm;
    }

    void duaTheVaoATM(){
        this.atm.nhanThe(this);
    }
    void rutTheKhoiATM(){
        this.atm.traThe(this);
    }

    @Override
    public boolean kiemTraSoDu(int soTien) {
        return soDu - soTien >= 50;
    }

    @Override
    public void nhanThongBao(int soTienRut, boolean thanhCong) {
        if (thanhCong){
            System.out.println("Tài khoản: " + tenTK);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            soDu -= soTienRut;
            System.out.println("Số dư còn lai: " + soDu);
        }else {
            System.out.println("Tài khoản: " + tenTK);
            System.out.println("Số dư ban đầu: " + soDu);
            System.out.println("Số tiền rút: " + soTienRut);
            System.out.println("Không đủ tiền để rút");
        }
    }
}
