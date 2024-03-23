package CompositePattern.B4;

public class MainB4 {
    public static void main(String[] args) {
        KeHoachKyHoc Nam2023 = new KeHoachKyHoc("Năm 2023");
        MonHoc Toan = new MonHoc("ToánA1", 3, 2);
        MonHoc Anh = new MonHoc("AnhB1", 2, 4);
        Nam2023.add(Toan);
        Nam2023.add(Anh);
        System.out.println(Nam2023.getCTDT());
    }
}
