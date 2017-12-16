public class HttpProxy implements Photo {
    private NetworkPhoto np;

    public HttpProxy() {
        this.np = new NetworkPhoto();
    }

    @Override
    public void getPhoto() {
        np.getPhoto();

    }

}