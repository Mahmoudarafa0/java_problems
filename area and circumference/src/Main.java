import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a shape: ");
        System.out.println("1 - triangle");
        System.out.println("2 - circle");
        int n = input.nextInt();
        if (n == 1) {
            Triangle t = new Triangle();
            System.out.print("Enter the first side length: ");
            t.setA(input.nextFloat());
            System.out.print("Enter the second side length: ");
            t.setB(input.nextFloat());
            System.out.print("Enter the third side length: ");
            t.setC(input.nextFloat());
            System.out.println("The area of the triangle = " + t.area(t.getA(),t.getB(),t.getC()));
            System.out.println("The circumference of the triangle = " + t.circumference(t.getA(),t.getB(),t.getC()));
        }
        if (n == 2) {
            Circle c = new Circle();
            System.out.print("Enter the radios of the circle: ");
            c.setR(input.nextFloat());
            System.out.println("The area of the circle = " + c.area(c.getR()));
            System.out.println("The circumference of the circle = " + c.circumference(c.getR()));
        }
    }
}