package builder.A2;

public class MyStringBuilder {
    private String str;

    public MyStringBuilder(Builder b) {
        this.str = b.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }

    public static class Builder{
        String str = "";
        public Builder addString(String s){
            this.str += s;
            return this;
        }

        public Builder addFloat(float f){
            this.str += String.valueOf(f);
            return this;
        }

        public Builder addBool(boolean b){
            this.str += String.valueOf(b);
            return this;
        }
        public MyStringBuilder build(){ return new MyStringBuilder(this);}
    }
}
