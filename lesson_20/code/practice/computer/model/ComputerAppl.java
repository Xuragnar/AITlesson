package practice.computer.model;

public class ComputerAppl {
    public static void main(String[] args) {
        Computer computer = new Computer("i5", 12, 512, "HP");
        Smartphone smartphone = new Smartphone("Snapdragon", 4, 512, "Samsung", 135465161);
        Laptop laptop = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        int[] arr = new int[10];
        Computer[] shop = new Computer[3];
        System.out.println(shop);
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 512, "Asus", 3, 2.1);
        Laptop[] shop1 = new Laptop[3];
        shop[2] = new Smartphone("Snapdragon", 4, 512, "Samsung", 135465161);

        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);
        }
        System.out.println();
        System.out.println(smartphone.toString());
        System.out.println();
        System.out.println(computer.toString());
        System.out.println(laptop.toString());
        System.out.println();
        printArray(shop);
        int sumHdd = 0;
        for (int i = 0; i < shop.length; i++) {
            sumHdd = sumHdd + shop[i].getSsd();
        }

        System.out.println("Total HDD = " + sumHdd);

    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}


