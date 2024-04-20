package decorator.tokennize;

public abstract class TokenDecorator implements Tokennize{
    Tokennize token;

    public TokenDecorator(Tokennize token) {
        this.token = token;
    }
}
