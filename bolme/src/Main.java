import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girişi alınması
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Toplam ve bölünen sayıların sayısını saklamak için değişkenler
        int toplam = 0;
        int bolumSayisi = 0;

        // 0'dan kullanıcının girdiği sayıya kadar olan sayılarda döngü
        for (int i = 0; i <= n; i++) {
            // Sayının 3 ve 4'e tam bölünüp bölünmediğini kontrol etme
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;  // Tam bölünen sayıları toplamı
                bolumSayisi++;  // Tam bölünen sayıların sayısını artırma
            }
        }

        // Bölünen sayıların ortalamasını hesapla
        double ortalama = (double) toplam / bolumSayisi;

        // Sonucu ekrana yazdırma
        System.out.println("0'dan " + n + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

        // Scanner kapatma
        scanner.close();
    }
}
