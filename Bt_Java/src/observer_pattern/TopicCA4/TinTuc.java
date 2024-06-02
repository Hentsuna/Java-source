package observer_pattern.TopicCA4;

public class TinTuc {
    int Id;
    String noiDung;

    public TinTuc(int id, String noiDung) {
        Id = id;
        this.noiDung = noiDung;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
