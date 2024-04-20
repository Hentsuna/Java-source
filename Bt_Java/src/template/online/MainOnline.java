package template.online;

public class MainOnline {
    public static void main(String[] args) {
        MySinhVien sv1 = new MySinhVien(1, "Trong", "25/11", "Tuy Hoà");
        ObjectDB<MySinhVien> sv = new MySinhVienDB();
        sv.getId(sv1);
        sv.add(sv1);
        System.out.println(sv);
    }
}
