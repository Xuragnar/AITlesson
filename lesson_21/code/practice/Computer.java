package practice;

public class Computer {

    private String cpu;
    private int ram;
    private int ssd;
    String brand;


    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public Computer() {

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String toString() {
        return "Brand : " + brand + " CPU : " + cpu + " RAM : " + ram + " SSD : " + ssd;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Computer)) {
            return false;
        }
        Computer other = (Computer) object;
        return cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd && brand.equals(other.brand);


    }
}





