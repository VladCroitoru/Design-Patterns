public class PhoneDecorator implements Phone {
    private Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }
    @Override
    public void call() {
        this.phone.call();
    }
    @Override
    public void message() {
        this.phone.message();
    }
}
