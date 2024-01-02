import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan üç kenar uzunluğunu alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();
        System.out.print("Üçgenin 2. kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();
        System.out.print("Üçgenin 3. kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        // Üçgenin alanını hesaplama
        double u = (kenar1 + kenar2 + kenar3) / 2; // Yarı çevre
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        // Sonucu ekrana yazdırma
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
