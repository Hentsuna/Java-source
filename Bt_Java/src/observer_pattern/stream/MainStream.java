package observer_pattern.stream;

import java.util.Date;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(stream);
        //MyClient client = new MyClient(stream);
        MyClientGeneric<List<MonHoc>> client = new MyClientGeneric<>(stream, monHocs-> {
            for (MonHoc monHoc : monHocs){
                System.out.println(monHoc.toString());
            }
        });
        System.out.println("Lần 1");
        dataAccess.add(new MonHoc("01", "Thể dục", 1));
        System.out.println("Lần 2");
        dataAccess.add(new MonHoc("02", "Sinh học", 3));
    }
}
