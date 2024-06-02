package observer_pattern.ConsoleCA2;

public class MainConsole {
    public static void main(String[] args) {
        Button button = new Button();
        Activity activity = new Activity(button);
        button.Click();

    }
}
