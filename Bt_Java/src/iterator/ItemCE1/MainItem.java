package iterator.ItemCE1;

public class MainItem {
    public static void main(String[] args) {
        ArrayAggregate aggregate = new ArrayAggregate();
        MyIterator iterator = aggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
