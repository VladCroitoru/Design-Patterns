public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mMediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println(String.format("colleague 2 gets the message:%s", message));
    }

}