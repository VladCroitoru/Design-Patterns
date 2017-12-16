public class FaceTimeDecorator extends PhoneDecorator {
    public FaceTimeDecorator(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        callWithFaceTime();
    }


    public void callWithFaceTime(){
        System.out.println("this call is powered by FaceTime...");
    }
}