package creational.singleton;

import java.lang.reflect.Constructor;

public class DestroySingletonDemo {

    public static void main(String[] args) {

        EagerInitialisedSingleton instanceOne = EagerInitialisedSingleton.getInstance();
        EagerInitialisedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = EagerInitialisedSingleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialisedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        // Both the hash codes are different
    }
}