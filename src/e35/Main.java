package e35;
class Product{
    String name;
    double price;
    double version;
    Product(String name, double price) {
        this.name = name;
        this.price = price;

        version = 0.0;// Not a parameter, so it doesn't need to be referenced by ".this"
    }
}
public class Main {
    public static void main(String[] args) {

        // Creating new Product objects
        Product fit1 = new Product("T-Shirt", 44.99);
        Product fit2 = new Product("Jeans", 69.99);

        System.out.println(fit1.name + " " + fit1.price); // Output: T-Shirt 44.99
        System.out.println(fit2.name + " " + fit2.price);
    }
}