package structural.adapter;

public class OnePlus5 implements AndroidPhone {

    @Override
    public void charge() {
        System.out.println("Charging OP5");
    }
}
