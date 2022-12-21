import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<>();
        products.add(new Book(20));
        products.add(new Book(30));
        products.add(new Book(40));
        products.add(new ChildrenBook(50));
        products.add(new ChildrenBook(60));
        products.add(new ChildrenBook(70));
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        System.out.println("The total price = " + sum);
    }
}