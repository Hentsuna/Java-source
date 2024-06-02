package observer_pattern.GameCA6;

public class MainGame {
    public static void main(String[] args) {
        PlayerData p = new PlayerData(100, 3, 0);
        System.out.println(p.toString());
        DashBoard d = new DashBoard(p);
        p.update(new PlayerData(50, 3, 5));
    }
}
