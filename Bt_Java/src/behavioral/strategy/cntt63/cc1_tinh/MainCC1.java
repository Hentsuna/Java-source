package behavioral.strategy.cntt63.cc1_tinh;

public class MainCC1 {
    public static void main(String[] args) {
        Context c = new Context();
        float kq1 = c.setTinh(new Cong()).tinh(3, 5);
        float kq2 = c.setTinh(new Nhan()).tinh(kq1, 7);
        System.out.println(kq1);
        System.out.println(kq2);
    }
}
