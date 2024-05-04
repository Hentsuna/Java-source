package observer_pattern.tigia;

public class NhaDauTuB implements TiGiaObserver{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
    }
    public void register(){
        t.attach(this);
    }
    public void unregister(){
        t.detach(this);
    }
    @Override
    public void update(float delta) {
        if(delta < 0){
            System.out.println("Nhà đầu tư B: Bán ra");
        }else System.out.println("Nhà đầu tư B: Mua vào");
    }
}
