package CompositePattern.B5;

public interface UIComponent{
    String show();
    void add(UIComponent uiComponent);
    void remove(UIComponent uiComponent);
}
