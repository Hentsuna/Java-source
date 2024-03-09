package builder.A5;

import java.util.ArrayList;
import java.util.List;

public class Sach {
    private final String tuaDe;
    private final String tacGia;
    private final int soTrang;
    List<String> dsChuong;

    protected Sach(Builder b) {
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.dsChuong = b.dsChuong;
        this.soTrang = b.soTrang;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(tuaDe).append("\n")
                .append(tacGia).append("\n")
                .append(soTrang).append("\n");
        int i = 1;
        for(String c: dsChuong)
            builder.append("\t").append(i++).append(". ").append(c).append("\n");
        return builder.toString();
    }

    public static class Builder{
        private String tuaDe, tacGia;
        private int soTrang;
        List<String> dsChuong = new ArrayList<>();
        public Builder addTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder addTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder addDsChuong(String chuong){
            this.dsChuong.add(chuong);
            return this;
        }
        public  Builder addSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Sach build(){
            return new Sach(this);
        }
    }
}
