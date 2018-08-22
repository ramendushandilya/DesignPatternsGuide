package creational.singleton;

import java.io.*;

public class SerialisedSingletonDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

        SerialisedSingleton instanceOne = SerialisedSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerialisedSingleton instanceTwo = (SerialisedSingleton) in.readObject();
        in.close();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
