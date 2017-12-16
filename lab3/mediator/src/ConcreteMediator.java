public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 mConcreteColleague1;
    private ConcreteColleague2 mConcreteColleague2;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == mConcreteColleague1) {
            mConcreteColleague2.notify(message);
        } else {
            mConcreteColleague1.notify(message);
        }
    }

    public void setColleague1(ConcreteColleague1 concrateColleague) {
        mConcreteColleague1 = concrateColleague;
    }

    public void setColleague2(ConcreteColleague2 concrateColleague) {
        mConcreteColleague2 = concrateColleague;
    }
}