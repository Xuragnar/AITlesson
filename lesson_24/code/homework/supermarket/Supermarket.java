package homework.supermarket;

import homework_13.Array;
import practice.model.Product;

import java.util.Arrays;

public class Supermarket {
    private Product[] products;
    private int quantity;

    public Supermarket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;
        quantity++;
        return true;

    }

    public Product findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barcode, double price) {
        Product product = findProduct(barcode);
        product.setPrice(price);
        return product;
    }

    public void removeProduct(long barcode) {
        for (int i = 2; i < products.length -1; i++) {
           products[i-1]=products[i];
           products[i]=null;
        }
        System.out.println(Arrays.toString(products));
    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }


}
