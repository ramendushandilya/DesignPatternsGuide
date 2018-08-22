package creational.singleton;

import java.io.Serializable;

public class SerialisedSingleton implements Serializable{

    private SerialisedSingleton() {

    }

    private static class SingletonHelper {

        private static final SerialisedSingleton instance =
                new SerialisedSingleton();
    }

    public static SerialisedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * For Serializable and Externalizable classes, the readResolve() method allows
     * a class to replace/resolve the object read from the stream before it is returned
     * to the caller
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

    // If the readResolve method isn't used then whenever the class is
    // deserialised it will create a new instance of the class
}