import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girişi alınması
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // 4 ve 5'in kuvvetlerini ekrana yazdıran döngü
        for (int i = 1; i <= sayi; i++) {
            // 4'ün kuvvetini yazdırma
            System.out.println("4^" + i + " = " + Math.pow(4, i));

            // 5'in kuvvetini yazdırma
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }

        // Scanner kapatma
        scanner.close();
    }
}
