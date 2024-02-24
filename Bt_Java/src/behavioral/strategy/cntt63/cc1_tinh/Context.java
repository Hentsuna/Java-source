package behavioral.strategy.cntt63.cc1_tinh;

public class Context {
    Tinh tinh;
    public Context setTinh(Tinh tinh){
        this.tinh = tinh;
        return this;
    }
    public float tinh(float a, float b){
        return tinh.tinh(a,b);
    }
}
