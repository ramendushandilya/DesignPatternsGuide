package creational.builder;

public class BuilderRunner {

    public static void main(String[] args) {
        Phone.Builder builder = new Phone.Builder()
                .backPanel("Sand stone")
                .frontPanel("AMOLED")
                .processor("Snap dragon")
                .camera("12 MP");

        Phone phone = builder.build();

        System.out.println(phone);
    }
}
