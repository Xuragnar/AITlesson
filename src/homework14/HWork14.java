package homework14;

public class HWork14 {
    public static void main(String[] args) {

        ModelClass car = new ModelClass(15, 2, "Skoda");
        System.out.println("Car age " + car.age);
        System.out.println("Car stage " + car.stages);
        System.out.println("Car model " + car.model);
        car.go();
        System.out.println("Car age " + car.getAge());
        System.out.print(car.getInfo());
        System.out.println();
        System.out.println("================");

        Driver driver = new Driver("Sergey", 35, 15);
        driver.sayName();
        driver.sayAge();
        System.out.println("++++++++++++++++");
        Driver driverCheater = new Driver("Pavel", 18, 35);
        System.out.println("-------------");

        ServiceStation goldServiceStation = new ServiceStation("Y Ashota",100,15);
        System.out.println("Name company: "+ goldServiceStation.companyName);
        System.out.println("Min Price: " + goldServiceStation.minPrice);
        System.out.println("Personal: "+ goldServiceStation.personal);
        System.out.println(goldServiceStation.repair(7));


    }

}
