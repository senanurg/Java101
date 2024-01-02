import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan tutar girişi alınıyor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutarı girin: ");
        double tutar = scanner.nextDouble();

        // KDV oranı ve KDV tutarı hesaplanıyor
        double kdvOrani = (tutar <= 1000) ? 0.18 : 0.08;
        double kdvTutari = tutar * kdvOrani;

        // Toplam tutar hesaplanıyor
        double toplamTutar = tutar + kdvTutari;

        // Sonuçlar ekrana yazdırılıyor
        System.out.println("Girilen Tutar: " + tutar + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
