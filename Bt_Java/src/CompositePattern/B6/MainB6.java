package CompositePattern.B6;

public class MainB6 {
    public static void main(String[] args) {
        BNode a = new InterNode(1);
        BNode b = new InterNode(2);
        BNode c = new InterNode(3);
        BNode d = new InterNode(4);
        a.addL(b);
        a.addR(c);
        b.addL(d);
        a.removeL();
        System.out.println(a.travel());
    }
}
