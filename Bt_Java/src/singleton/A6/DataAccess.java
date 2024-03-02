package singleton.A6;

public class DataAccess {
    private static DataAccess instance;

    private DataAccess() {
    }
    public static DataAccess getInstance(){
        if(instance == null)
            instance = new DataAccess();
        return instance;
    }
//Khai baos ds san pham
    //Cac phuong them xoa sua cap nhat sp
}
