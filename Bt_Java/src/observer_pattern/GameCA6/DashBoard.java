package observer_pattern.GameCA6;

public class DashBoard implements PlayerDataListener{
    PlayerData p;

    public DashBoard(PlayerData p) {
        this.p = p;
        p.dangKy(this);
    }

    @Override
    public void update(PlayerData p) {
        System.out.println(p.toString());
    }
}
