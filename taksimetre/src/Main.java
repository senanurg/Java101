import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan gidilen mesafeyi alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi (KM) Girin: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre tutarını hesaplama
        double acilisUcreti = 10.0;
        double kmBasinaUcret = 2.20;
        double minOdeme = 20.0;

        // Minimum ödeme kontrolü ve taksimetre tutarını hesaplama
        double tutar = acilisUcreti + Math.max(0, mesafe * kmBasinaUcret - minOdeme);

        // Sonucu ekrana yazdırma
        System.out.println("Taksimetre Tutarı: " + tutar + " TL");
    }
}
