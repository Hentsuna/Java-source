package builder.A1;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .setHeader("A1","25", "Trong")
                .addCTHD("Tivi",1,10000,2)
                .build();
        System.out.println(hoaDon.toString());
    }
}
