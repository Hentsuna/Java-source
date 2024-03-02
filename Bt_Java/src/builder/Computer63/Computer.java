package builder.Computer63;

//1.Lớp khi tạo đối tượng phải khởi tạo nhiều thành phần
public class Computer {
    //2.Khai báo các thành phần của lớp cần hỗ trợ việc khởi tạo đối tượng
    private String CPU, RAM, storage, screen;
    //4. Hàm khởi tạo

    protected Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    //3.thành phần builder
    public static class Builder{
        String CPU, RAM, storage, screen;
        public  Builder addCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder addRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }
    //5. phương thức tạo ra đối tượng Computer
}
