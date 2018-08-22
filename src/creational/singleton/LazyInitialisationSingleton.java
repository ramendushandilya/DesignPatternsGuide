package creational.singleton;

/**
 * This method creates the instance in the global access method
 */
public class LazyInitialisationSingleton {

    private static LazyInitialisationSingleton instance;

    private LazyInitialisationSingleton() {}

    public static LazyInitialisationSingleton getInstance() {

        if (instance == null) {
            instance = new LazyInitialisationSingleton();
        }
        return instance;
    }
}
/**
 * The above implementation works fine in case of single threaded environment
 * In case of multi threaded systems, it can cause issues if multiple threads
 * are inside the if section at the same time
 * It will destroy the singleton pattern and both threads will get different
 * instances of the singleton class
 */