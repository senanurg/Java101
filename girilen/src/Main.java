import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        // Tek bir sayı girilene kadar döngüyü devam ettirme
        while (true) {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0 giriniz): ");
            int sayi = scanner.nextInt();

            // Kullanıcı 0 girdiyse döngüyü sonlandırma
            if (sayi == 0) {
                break;
            }

            // Çift ve 4'ün katları olan sayıları toplama
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        // Scanner kapatma
        scanner.close();
    }
}
