package creational.protoType;

public class EmployeeRecord implements Prototype{

    private int id;
    private String name;
    private int salary;

    public EmployeeRecord(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeRecord() {
        System.out.println("Employee records");
        System.out.println("------------------");
        System.out.println("ID : "+id+" Name : "+name+" Salary : "+salary);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, salary);
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
