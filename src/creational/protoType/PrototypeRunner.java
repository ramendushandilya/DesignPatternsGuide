package creational.protoType;

public class PrototypeRunner {

    public static void main(String[] args) {
        EmployeeRecord one = new EmployeeRecord(1, "Ram", 23);
        EmployeeRecord two = (EmployeeRecord) one.getClone();

        System.out.println(one);
        System.out.println(two);
    }
}
