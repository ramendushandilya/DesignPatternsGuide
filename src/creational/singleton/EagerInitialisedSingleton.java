package creational.singleton;

/**
 * The instance of the singleton class is created at the time of class loading
 * Easiest way to create singleton class
 * Drawback : Instance is created even though the client application might not
 * be using it
 */
public class EagerInitialisedSingleton {

    // The only instance of the class
    private static final  EagerInitialisedSingleton instance
            = new EagerInitialisedSingleton();

    // Private constructor to avoid class instantiation by client
    private EagerInitialisedSingleton() {

    }

    // Only public method to get the instance to class
    public static EagerInitialisedSingleton getInstance() {

        return instance;
    }
}
/**
 * If your singleton class is nit using lot of resources this is the approach to use
 * But in most of the cases singleton classes are created for resources such FileSystem
 * database connection etc and we should avoid the instantiation until unless client calls
 * the getInstance method. Also this method doesn't provide any options for exception handling
 */