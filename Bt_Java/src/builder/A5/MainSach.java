package builder.A5;

public class MainSach {
    public static void main(String[] args) {
        Sach sach = new Sach.Builder()
                .addTuaDe("Lập trình")
                .addSoTrang(30)
                .addTacGia("Trọng")
                .addDsChuong("Chương 1")
                .addDsChuong("hffhhf")
                .build();
        System.out.println(sach.toString());
    }
}
