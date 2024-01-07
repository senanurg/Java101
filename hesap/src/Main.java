import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("Operatörü girin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double sonuc = 0;

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata! Sıfıra bölme hatası.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz operatör girdiniz.");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
