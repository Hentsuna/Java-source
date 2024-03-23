package CompositePattern.B3;

public abstract class File {
    public String tenFile, ngayTao, duongDan;
    String p = "";

    public File(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
        this.duongDan = tenFile;
    }

    public abstract void add(File f);
    public abstract void remove(File f);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }

}
