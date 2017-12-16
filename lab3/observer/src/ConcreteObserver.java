public class ConcreteObserver extends Observer {
    private String mName;
    private String mObserverState;
    private ConcreteSubject mSubject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        mSubject = subject;
        mName = name;
    }

    @Override
    public void update() {
        mObserverState = mSubject.getSubjectState();
        String format = String.format("The current state of %s observer is %s", mName, mObserverState);
        System.out.println(format);
    }

    public ConcreteSubject getmSubject() {
        return mSubject;
    }

    public void setmSubject(ConcreteSubject mSubject) {
        this.mSubject = mSubject;
    }

}