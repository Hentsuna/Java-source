package observer_pattern.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<TiGiaObserver> observers = new ArrayList<TiGiaObserver>();
    public void attach(TiGiaObserver observer){
        observers.add(observer);
    }
    public void detach(TiGiaObserver observer){
        observers.remove(observer);
    }
    public void notify(float delta){
        for (TiGiaObserver observer: observers){
            observer.update(delta);
        }
    }
}
