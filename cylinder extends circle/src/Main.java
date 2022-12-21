public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        System.out.println(circle.toString());
        System.out.println("--------------------------------------------");
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 1.0);
        System.out.println(cylinder.toString());
    }
}