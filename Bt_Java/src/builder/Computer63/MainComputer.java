package builder.Computer63;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .addCPU("IntelCeleron I9")
                .addRAM("128MB")
                .addStorage("64GB")
                .addScreen("Full HD")
                .build();
        System.out.println(computer.toString());
    }
}
