package decorator.bieuthuc;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc a = new BieuThucDonGian(5);
        a = new Cong(a, 3);
        System.out.println(a.bieuThuc());
        System.out.println(a.giaTri());
        a = new Tru(a, 2);
        System.out.println(a.bieuThuc());
        System.out.println(a.giaTri());
        a = new Nhan(a, 3);
        System.out.println(a.bieuThuc());
        System.out.println(a.giaTri());
        a = new Chia(a, 3);
        System.out.println(a.bieuThuc());
        System.out.println(a.giaTri());
        a = new GiaTriTuyetDoi(a);
        System.out.println(a.bieuThuc());
        System.out.println(a.giaTri());
    }
}
