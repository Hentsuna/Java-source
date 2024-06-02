package observer_pattern.ConsoleCA2;

public class Activity implements ButtonListener{
    int count;
    Button button;

    public Activity(Button button) {
        this.button = button;
        button.dangKy(this);
    }

    @Override
    public void onClick(Button button) {
        System.out.println("Bạn đã click lần thứ" + count++);
    }
}
