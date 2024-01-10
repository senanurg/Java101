import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Armstrong sayısı kontrolü
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        // Basamak sayısını bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        // Armstrong sayısı kontrolü
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

        // Basamak sayılarının toplamını hesaplama
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;

        tempNumber = sayi;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            toplam += basValue;
            tempNumber /= 10;
        }

        System.out.println(sayi + " sayısının basamakları toplamı: " + toplam);

        // Scanner kapatma
        input.close();
    }
}
