package template.online;

import java.util.ArrayList;
import java.util.List;

public abstract class ObjectDB<T> {
    List<T> list = new ArrayList<>();

    //Có 1 phương thức template là getId
    public abstract int getId(T t);
    T findByID(int id){
        for(var t: list){
            if(getId(t) == id)
                return t;
        }
        return null;
    }

    public void add(T t){
        for(var o: list){
            if (getId(o) ==  getId(t))
                return;
        }
        list.add(t);
    }
    
    public void update(T t){
        for (int i = 0; i < list.size(); i++) {
            if(getId(list.get(i)) == getId(t)){
                list.set(i,t);
                return;
            }
        }
    }

    public void deleteByID(int id){
        for(var o: list){
            if (getId(o) == id){
                list.remove(o);
                return;
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T o:list){
            builder.append("Danh sách sinh viên").append(o);
        }
        return builder.toString();
    }


//    @Override
//    public String toString() {
//        return "ObjectDB{" +
//                "list=" + list +
//                '}';
//    }
}
