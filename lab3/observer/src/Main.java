public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Z"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "FAF"));

        concreteSubject.setSubjectState("ABC");
        concreteSubject.notification();
    }
}
