import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan boy ve kilo değerlerini alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        // Vücut Kitle İndeksini hesaplama
        double vki = kilo / (boy * boy);

        // Sonucu ekrana yazdırma
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
