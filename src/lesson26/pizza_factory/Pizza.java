package lesson26.pizza_factory;

public abstract class Pizza {

    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void orderPizza(){
        prepare();
        bake();
        pack();
    }

   protected abstract void prepare();// означает что в дочерних классах метод/переменная будет видна

    private void bake() {
        System.out.println("Baking " + type);
    }

    private void pack() {
        System.out.println("Packing " + type);
    }


}
