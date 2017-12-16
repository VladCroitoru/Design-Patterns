public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {

        mMediator.send(message, this);
    }

    public void notify(String message) {

        System.out.println(String.format("colleague 1 gets the message:%s", message));

    }

}