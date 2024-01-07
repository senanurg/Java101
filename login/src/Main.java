import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Örnek bir kullanıcı ve şifre
        String dogruSifre = "gizli123";

        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();

        // Şifre kontrolü
        if (girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı. Hoş geldiniz!");
        } else {
            System.out.println("Hatalı şifre. Şifrenizi sıfırlamak ister misiniz? (E/H)");

            // Kullanıcının şifresini sıfırlamak isteyip istemediğini kontrol et
            char cevap = scanner.next().charAt(0);

            if (cevap == 'E' || cevap == 'e') {
                scanner.nextLine(); // Boş satırı oku (nextInt() sonrası bir sorun çıkmasın diye)

                System.out.print("Yeni şifrenizi girin: ");
                String yeniSifre = scanner.nextLine();

                // Yeni şifrenin doğruluğunu kontrol et
                if (!yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Hata! Yeni şifre, eski şifre ile aynı olamaz. Şifre oluşturulamadı.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
