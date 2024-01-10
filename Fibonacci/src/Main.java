import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println(n + " Elemanlı Fibonacci Serisi:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }

        scanner.close();
    }
}
