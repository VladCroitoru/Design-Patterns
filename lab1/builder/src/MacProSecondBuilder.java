public class MacProSecondBuilder implements Builder {

    private MacPro macPro = new MacPro();

    @Override
    public void buildProcessor() {

        macPro.addPart("i7");
        macPro.addPrice(1800d);
    }

    @Override
    public void buildMemory() {

        macPro.addPart("16GB");
        macPro.addPrice(1000d);
    }

    @Override
    public void buildStorage() {

        macPro.addPart("256GB");
        macPro.addPrice(2800d);
    }

    @Override
    public void buildBar() {

        macPro.addPart("non Bar");
        macPro.addPrice(0d);
    }

    @Override
    public MacPro getResult() {

        return macPro;
    }

}
