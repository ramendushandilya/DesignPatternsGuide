package structural.adapter;

public class AdapterRunner {

    public static void main(String[] args) {
        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        AndroidPhone androidPhone = new OnePlus5();
        AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);
    }
}
