package homework_16.pet.model;

public class PetAppl {
    public static void main(String[] args) {
        Pet cat = new Pet(1,"mammals",5,"Cat");
        cat.display();
        System.out.println();
        cat.eating();
        cat.sleeping();
        cat.playing();
        cat.sound();
        cat.walking();
        Pet dog =new Pet(2,"mammals",7,"Rex");
        dog.display();
        System.out.println();
        dog.eating();
        dog.sleeping();
        dog.playing();
        dog.sound();
        dog.walking();
    }
}
