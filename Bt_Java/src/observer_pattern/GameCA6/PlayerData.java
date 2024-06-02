package observer_pattern.GameCA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    public int thoigian, countdown, grade;

    public PlayerData(int thoigian, int countdown, int grade) {
        this.thoigian = thoigian;
        this.countdown = countdown;
        this.grade = grade;
    }

    List<PlayerDataListener> listeners = new ArrayList<PlayerDataListener>();

    void dangKy(PlayerDataListener listener){
        listeners.add(listener);
    }
    void huyDangKy(PlayerDataListener listener){
        listeners.remove(listener);
    }

    void update(PlayerData p){
        for(PlayerDataListener listener : listeners)
            listener.update(p);
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "thoigian=" + thoigian +
                ", countdown=" + countdown +
                ", grade=" + grade +
                '}';
    }
}
