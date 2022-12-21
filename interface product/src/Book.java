public class Book implements Product {
    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
