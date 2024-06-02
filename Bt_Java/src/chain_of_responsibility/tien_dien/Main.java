package chain_of_responsibility.tien_dien;

public class Main {
    public static void main(String[] args) {
        BacThang b1 = new Bac("0-->50", "Bậc 1", 50, 0, 1806);
        BacThang b2 = new Bac("50-->100", "Bậc 2", 100, 50, 1866);
        BacThang b3 = new Bac("100-->200", "Bậc 3", 200, 100, 2167);
        BacThang b4 = new Bac("200-->300", "Bậc 4", 300, 200, 2729);
        BacThang b5 = new Bac("300-->400", "Bậc 5", 400, 300, 3050);
        BacThang b6 = new BacMax(">400", "Bậc 6", Integer.MAX_VALUE, 400, 3151);
        b1.ketiep(b2).ketiep(b3).ketiep(b4).ketiep(b5).ketiep(b6);
        System.out.println("Tổng tiền điện: " + b1.TinhTien(450));
    }
}
