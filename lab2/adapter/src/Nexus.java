public class Nexus {
    private MicroUSB microUSB;
    public Nexus(){}
    public Nexus(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }

    public void charge(){
        System.out.println("Nexus Charge started!");
        microUSB.chargeWithMicroUSB();
        System.out.println("Nexus Charge finished!");
    }

    public void setMicroUSB(MicroUSB microUSB) {
        this.microUSB = microUSB;
    }
}
