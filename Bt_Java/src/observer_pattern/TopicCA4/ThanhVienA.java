package observer_pattern.TopicCA4;

public class ThanhVienA implements TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println(t.getNoiDung());
    }
}
