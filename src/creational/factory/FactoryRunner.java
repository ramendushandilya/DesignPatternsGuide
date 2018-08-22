package creational.factory;

public class FactoryRunner {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 Ghz");
        Computer server = ComputerFactory.getComputer("server", "16GB", "1 TB", "2.9Ghz");

        System.out.println("PC Config "+pc);
        System.out.println("Server Config "+server);
    }
}
