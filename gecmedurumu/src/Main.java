import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        int fizik = scanner.nextInt();

        System.out.print("Türkçe notunuzu girin: ");
        int turkce = scanner.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        int kimya = scanner.nextInt();

        System.out.print("Müzik notunuzu girin: ");
        int muzik = scanner.nextInt();

        // Notların 0-100 arasında olup olmadığını kontrol et
        if (matematik >= 0 && matematik <= 100 &&
                fizik >= 0 && fizik <= 100 &&
                turkce >= 0 && turkce <= 100 &&
                kimya >= 0 && kimya <= 100 &&
                muzik >= 0 && muzik <= 100) {

            // Notların ortalamasını hesapla
            double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5.0;

            // Ortalama 55'ten büyükse sınıfı geçmiştir
            if (ortalama >= 55) {
                System.out.println("Ortalama: " + ortalama + ". Sınıfı geçtiniz!");
            } else {
                System.out.println("Ortalama: " + ortalama + ". Sınıfta kaldınız.");
            }

        } else {
            System.out.println("Hatalı not girişi. Notlar 0-100 arasında olmalıdır.");
        }
    }
}
