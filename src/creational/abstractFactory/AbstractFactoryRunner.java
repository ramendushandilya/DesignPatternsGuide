package creational.abstractFactory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {

        runAbstractFactory();
    }

    private static void runAbstractFactory() {

        Computer pc =
                ComputerFactory.getComputer(new PCFactory("2 Gb", "6 gb", "fast"));
        Computer server =
                ComputerFactory.getComputer(new ServerFactory("2 Gb", "6 gb", "fast"));

        System.out.println("pc = "+pc);
        System.out.println("server = "+server);
    }
}