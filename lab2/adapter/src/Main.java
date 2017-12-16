public class Main {

    public static void main(String[] args) {
        ChargerAdapter adapter=new ChargerAdapter(new AndroidCharger());
        IPhone iPhone=new IPhone();
        iPhone.setLightning(adapter);
        iPhone.charge();
    }
}