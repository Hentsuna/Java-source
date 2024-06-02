package observer_pattern.TopicCA4;

public class MainTopic {
    public static void main(String[] args) {
        Topic t = new Topic();
        ThanhVienA a = new ThanhVienA(t);
        ThanhVienB b = new ThanhVienB(t);
        t.themMoi(new TinTuc(1, "Tung ngu"));
        t.themMoi(new TinTuc(2, "Minh ngu"));
        t.capNhat(new TinTuc(2, "Minh ngu lam"));

    }
}
