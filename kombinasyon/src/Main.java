import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerinin alınması
        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        // Kombinasyon hesaplama
        int kombinasyon = 1;

        // Faktöriyel hesaplama ve kombinasyon hesabı tek bir döngü içinde
        for (int i = 1; i <= r; i++) {
            kombinasyon *= n--;
            kombinasyon /= i;
        }

        // Sonucu ekrana yazdırma
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        // Scanner kapatma
        scanner.close();
    }
}
