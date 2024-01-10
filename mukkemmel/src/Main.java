import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num + " Mükemmel sayıdır.");
            } else {
                System.out.println(num + " Mükemmel sayı değildir.");
            }
        }

        scanner.close();
    }
}
