package CompositePattern.B3;

public class File63 extends File{

    public File63(String tenFile, String ngayTao) {
        super(tenFile, ngayTao);
    }

    @Override
    public void add(File f) {

    }

    @Override
    public void remove(File f) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.tenFile;
    }
}
