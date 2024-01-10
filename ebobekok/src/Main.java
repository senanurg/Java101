import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınması
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();

        int ebob = 1;
        int i = 2;

        // EBOB hesaplama
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (num1 * num2) / ebob;

        // Sonuçları ekrana yazdırma
        System.out.println("EBOB(" + num1 + ", " + num2 + ") = " + ebob);
        System.out.println("EKOK(" + num1 + ", " + num2 + ") = " + ekok);

        // Scanner kapatma
        scanner.close();
    }
}
