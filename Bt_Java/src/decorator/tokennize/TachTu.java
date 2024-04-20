package decorator.tokennize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokennize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokennize() {
        String[] tokens = s.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(tokens));
        return list;
    }
}
