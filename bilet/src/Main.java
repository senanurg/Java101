import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Hatalı veri kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double normalTutar = mesafe * 0.10;
            double indirimOrani = 0;

            // Yaş indirimi
            if (yas < 12) {
                indirimOrani += 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani += 0.10;
            } else if (yas >= 65) {
                indirimOrani += 0.30;
            }

            // Gidiş Dönüş indirimi
            if (yolculukTipi == 2) {
                indirimOrani += 0.20;
            }

            // Toplam Tutar Hesaplama
            double indirimTutari = normalTutar * indirimOrani;
            double toplamTutar = (normalTutar - indirimTutari) * (yolculukTipi == 2 ? 2 : 1);

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }

        scanner.close();
    }
}
