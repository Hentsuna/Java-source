package decorator.tokennize;

import java.util.List;

public class RemovePunchtuation extends TokenDecorator{
    public RemovePunchtuation(Tokennize token) {
        super(token);
    }

    @Override
    public List<String> tokennize() {
        List<String> list = token.tokennize();
        list.replaceAll(s -> s.replaceAll("\\p{Punct}", ""));
        return list;
    }
}
