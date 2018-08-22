package creational.factory;

/**
 * We can keep factory class Singleton or we can keep the method
 * that returns the subclass as static
 */
public class ComputerFactory {

    // getComputer() is the factory method
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {

        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if("server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        } else {
            return null;
        }
    }
}
