import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınması
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        double harmonicSeries = 0.0;

        // Harmonik seriyi hesaplama
        for (int i = 1; i <= n; i++) {
            harmonicSeries += 1.0 / i;
        }

        // Sonucu ekrana yazdırma
        System.out.println("Harmonik Seri (" + n + ") = " + harmonicSeries);

        // Scanner kapatma
        scanner.close();
    }
}
