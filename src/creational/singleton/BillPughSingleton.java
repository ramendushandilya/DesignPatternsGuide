package creational.singleton;

/**
 * Using inner static helper class
 */
public class BillPughSingleton {

    private BillPughSingleton() {

    }

    // Private inner class contains the instance of the Singleton class
    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE =
                new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {

        return SingletonHelper.INSTANCE;
    }
}

/**
 * When the Singleton class is loaded, SingletonHelper class is not loaded
 * in the memory and only when someone calls the getInstance method, this
 * class is loaded and creates the Singleton class
 * Most widely used approach as it doesn't require synchronisation
 */