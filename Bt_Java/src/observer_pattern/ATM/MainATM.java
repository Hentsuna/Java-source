package observer_pattern.ATM;

public class MainATM {
    public static void main(String[] args) {
        ATM1 atm = new ATM1();
        TaiKhoan1 t1 = new TaiKhoan1("Trong", 1000, atm);
        TaiKhoan1 t2 = new TaiKhoan1("Tùng", 500, atm);
        t1.duaTheVaoATM();
        System.out.println("Lần 1:");
        atm.rutTien(300);
        System.out.println("Lần 2:");
        atm.rutTien(800);
        t1.rutTheKhoiATM();
        System.out.println("Lần 3:");
        atm.rutTien(300);
        System.out.println("Lần 4:");
        t2.duaTheVaoATM();
        atm.rutTien(900);
        t2.rutTheKhoiATM();
    }
}
