import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alınması
        System.out.print("Taban değerini giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Üslü sayı hesaplama
        int sonuc = 1;
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        // Sonucu ekrana yazdırma
        System.out.println(taban + "^" + us + " = " + sonuc);

        // Scanner kapatma
        scanner.close();
    }
}
