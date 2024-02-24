package behavioral.strategy.cntt63.duck63;

public abstract class Duck63 {
    IFlyable flyable;
    IQuackable quackable;

    public IFlyable getFlyable() {
        return flyable;
    }

    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public IQuackable getQuackable() {
        return quackable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }

    public abstract void display();
    public void performQuack(){
        System.out.println(quackable.quack());
    }
    public void performFly(){
        System.out.println(flyable.fly());
    }
}
