package creational.singleton;

/**
 * Static block initialisation implementation is same to eager initialisation
 * except the instance of class is created in the static block that provides option
 * for exception handling
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception exceptio) {
            throw new RuntimeException("Exception occurred in creating instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

/**
 * Both eager and static initialisation create the instance even before it's being
 * used and that is not the best practice to use. We need something for lazy initialisation
 */