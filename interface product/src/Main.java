import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<>();
        products.add(new Cartoon(50));
        products.add(new Cartoon(70));
        products.add(new Cartoon(80));
        products.add(new Cartoon(90));
        products.add(new Cartoon(100));
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        System.out.println("The total price = " + sum);
    }
}