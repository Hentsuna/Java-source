package decorator.tokennize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenDecorator{
    ArrayList stopword;
    public RemoveStopword(Tokennize token) {
        super(token);
        stopword = new ArrayList(Arrays.asList("và", "hoặc", "thì", "mà", "là", "nhưng", "được"));
    }

    @Override
    public List<String> tokennize() {
        List<String> list = token.tokennize();
        list.removeAll(stopword);
        return list;
    }
}
