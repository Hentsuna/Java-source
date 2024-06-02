package observer_pattern.ConsoleCA2;

import java.util.ArrayList;
import java.util.List;

public class Button {

    ButtonListener listeners;
    public void dangKy(ButtonListener listener){
        this.listeners = listener;
    }
    public void huyDangKy(ButtonListener listener){}
    public void Click(){
        listeners.onClick(this);
    }
}
