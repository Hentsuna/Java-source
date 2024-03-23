package CompositePattern.B3;

import java.util.ArrayList;
import java.util.List;

public class ThuMuc extends File{
    List<File> children = new ArrayList<>();

    public ThuMuc(String tenFile, String ngayTao) {
        super(tenFile, ngayTao);
    }

    @Override
    public void add(File f) {
        children.add(f);
        f.duongDan = this.duongDan + "\\" + f.tenFile;
    }

    @Override
    public void remove(File f) {
        children.remove(f);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.tenFile);
        for (var f:children) {
            f.p = this.p + "\t";
            builder.append("\n").append(f.p).append(f.getStringTreeFolder());
            f.p = "";
        }
        return builder.toString();
    }
}
