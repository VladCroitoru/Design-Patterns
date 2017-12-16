public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        MacProFirstBuilder mpfb = new MacProFirstBuilder();
        MacProSecondBuilder mpsb = new MacProSecondBuilder();

        director.construct(mpfb);
        mpfb.getResult().showMacPro();

        director.construct(mpsb);
        mpsb.getResult().showMacPro();
    }
}
