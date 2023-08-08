package homework14;

public class ServiceStation {
    String companyName;
    int minPrice;
    int personal;

    public ServiceStation(String companyName, int minPrice, int personal) {
        this.companyName = companyName;
        this.minPrice = minPrice;
        this.personal = personal;
    }

    int repair(int stage) {
        if (stage >= 10) {
            return this.minPrice + 300;
        }
        if ( stage >= 5) {
            return this.minPrice + 200;

        }
        return minPrice;

    }

}
