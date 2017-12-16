public class Main {
    public static void main(String[] args) {
        Phone phone=new ApplePhone();
        phone.call();
        phone.message();
        System.out.println("--------------------------------------");

        phone = new IMessageDecorator(new FaceTimeDecorator(phone));
        phone.call();
        phone.message();

    }
}
