package practice.computer.model;

public class Smartphone extends Computer {
    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, long imei) {
        super(cpu, ram, ssd, brand);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public String toString() {
        return super.toString() + ", IMEI " + imei;
    }
}
