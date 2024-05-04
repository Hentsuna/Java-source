package observer_pattern.stream;

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    List<MyStreamListener> listeners = new ArrayList<MyStreamListener>();
    public void addListener(MyStreamListener listener){
        listeners.add(listener);
    }
    public void addEvent(T t){
        for (MyStreamListener l : listeners){
            l.listen(t);
        }
    }
}
