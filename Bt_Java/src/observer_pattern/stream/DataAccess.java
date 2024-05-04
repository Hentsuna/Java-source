package observer_pattern.stream;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc monHoc){
        list.add(monHoc);
        stream.addEvent(list);
    }
    public void delete(String id){
        list.remove(id);
        stream.addEvent(list);
    }
    public void update(MonHoc monHoc){

    }
}
