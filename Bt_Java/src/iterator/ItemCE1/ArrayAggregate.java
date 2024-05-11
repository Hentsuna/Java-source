package iterator.ItemCE1;

public class ArrayAggregate extends Aggregate{
    private int[] array = {1,2,3,4,5,6,7};
    public int getItem(int i){
        return array[i];
    }
    public int count(){
        return array.length;
    }
    @Override
    public MyIterator createIterator() {
        return new ArrayIterator(this);
    }
}
