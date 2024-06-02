package observer_pattern.TopicCA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<TinTuc> list = new ArrayList<TinTuc>();
    List<TopicListener> listeners = new ArrayList<TopicListener>();
    public void dangKy(TopicListener listener){
        listeners.add(listener);
    }
    public void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }

    public void themMoi(TinTuc t){
        list.add(t);
        for(TopicListener listener: listeners)
            listener.listen(t);
    }
     public void capNhat(TinTuc t){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId()==t.getId())
            {
                list.set(i,t);
                for(TopicListener listener: listeners)
                    listener.listen(t);
                return;
            }
        }
     }
}
