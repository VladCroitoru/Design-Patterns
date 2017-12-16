public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(String.format("%s is processing %d", this.getClass().getName(), request));
        } else if (mSuccessor != null) {
            mSuccessor.handleRequest(request);
        }
    }

}