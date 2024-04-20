package template.cafe;

public class Coffee extends CaffeineBeverage{

        @Override
        void brew() {
            builder.append("\n")
                    .append("Chế cà phê");
        }

        @Override
        void addCondiments() {
            builder.append("\n")
                    .append("Thêm đường, sữa");
        }


}
