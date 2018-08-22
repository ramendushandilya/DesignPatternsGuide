package creational.singleton;

/**
 * Here new EnumSingleton() is done by the JVM
 *
 */
public enum EnumSingleton {

    INSTANCE;

    private static void doSomething() {

    }
}

/**
 * To overcome the situation with reflection , Joshua Bloch suggests
 * the use of Enum to implement Singleton design pattern as Java
 * ensures that any enum value is instantiated only once in program
 *
 */