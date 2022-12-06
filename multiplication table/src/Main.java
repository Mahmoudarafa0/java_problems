import java.util.Scanner;

public class Main {
    public static void multiplicationTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        multiplicationTable(n);
    }
}
