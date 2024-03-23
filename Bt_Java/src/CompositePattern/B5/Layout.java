package CompositePattern.B5;

import java.util.ArrayList;
import java.util.List;

public class Layout implements UIComponent{
    String ten;
    List<UIComponent> children = new ArrayList<>();


    @Override
    public String show() {
        return null;
    }

    @Override
    public void add(UIComponent uiComponent) {

    }

    @Override
    public void remove(UIComponent uiComponent) {

    }
}
