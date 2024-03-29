package singleton.vidu;

public class MySingleton {
    private static MySingleton instance;

    int count;

    private MySingleton() {
    }
    public static MySingleton getInstance(){
        if (instance == null)
            instance = new MySingleton();
        return instance;
    }

    public void inCount(){
        System.out.print(++count);
    }
}
