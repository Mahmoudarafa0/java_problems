import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = input.nextInt();
        System.out.print("enter r : ");
        int r = input.nextInt();
        int nCr = factorial(n)/(factorial(r)*factorial(n-r));
        int nPr = factorial(n)/factorial(n-r);
        System.out.println("nCr = "+ nCr);
        System.out.println("nPr = "+nPr);
    }
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}