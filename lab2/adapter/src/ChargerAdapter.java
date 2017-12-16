public class ChargerAdapter implements Lightning {
    private MicroUSB microUSB;

    public ChargerAdapter() {
    }

    public ChargerAdapter(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    @Override
    public void chargeWithLightning() {
        microUSB.chargeWithMicroUSB();
    }

    public void setMicroUSB(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }
}
