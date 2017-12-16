public class IMessageDecorator extends PhoneDecorator {
    public IMessageDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void message() {
        super.message();
        messageWithIMessage();
    }

    public void messageWithIMessage(){
        System.out.println("this message is powered by IMessage...");
    }
}