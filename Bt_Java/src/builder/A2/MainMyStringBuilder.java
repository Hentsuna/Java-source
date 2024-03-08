package builder.A2;

public class MainMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder str1 = new MyStringBuilder.Builder().addString("Hôm nay trời đẹp")
                .addFloat(15)
                .addBool(false)
                .build();
        System.out.println(str1.toString());
    }
}
