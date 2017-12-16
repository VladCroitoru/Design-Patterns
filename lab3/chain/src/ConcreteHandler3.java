public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(String.format("%s is processing %d", this.getClass().getName(), request));
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }

}