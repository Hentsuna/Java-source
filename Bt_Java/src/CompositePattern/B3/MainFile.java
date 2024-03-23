package CompositePattern.B3;

public class MainFile {
    public static void main(String[] args) {
        ThuMuc a = new ThuMuc("Tai Lieu", "5/12");
        ThuMuc b = new ThuMuc("Design Pattern","5/12");
        ThuMuc c = new ThuMuc("Lap Trinh Java","5/12");
        ThuMuc d = new ThuMuc("LapTrinhThietBiDiDong","5/12");
        File63 e = new File63("CreationalPattern.pptx", "5/12");
        File63 f = new File63("StructuralPattern.pptx", "5/12");
        File63 g = new File63("LapTrinhJavaCoBan.docx", "5/12");
        File63 h = new File63("LapTrinhJavaNangCao.pdf", "5/12");
        File63 i = new File63("NgonNguLapTrinhC.pdf", "5/12");
        File63 k = new File63("CoBan.pptx", "5/12");
        File63 l = new File63("NangCao.pptx", "5/12");
        a.add(b);
        b.add(e);
        b.add(f);
        a.add(c);
        a.add(i);
        a.add(d);
        c.add(g);
        c.add(h);
        d.add(k);
        d.add(l);
        System.out.println(a.getStringTreeFolder());
    }
}
