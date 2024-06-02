package observer_pattern.TopicCA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    Topic topic;
    List<TinTuc> list = new ArrayList<TinTuc>();

    public ThanhVienB(Topic topic) {
        this.topic = topic;
        topic.dangKy(this);
    }

    private int getSoTT(TinTuc t){
        for(int i =0; i< list.size(); i++){
            if(list.get(i).getId() == t.getId()){
               return i;
            }
        }
        return -1;
    }

    @Override
    public void listen(TinTuc t) {
        boolean tintuc = false;
        for(int i =0; i< list.size(); i++){
            if(list.get(i).getId() == t.getId()){
                list.set(i,t);
                tintuc = true;
                break;
            }
        }
        if(!tintuc){
            list.add(t);
        }
        System.out.println(getSoTT(t) + " " + t.getNoiDung());
    }
}
