import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan yarıçap ve merkez açısını alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yarıçapı (r) girin: ");
        double yaricap = scanner.nextDouble();
        System.out.print("Merkez Açısının Ölçüsü (𝛼) girin: ");
        double merkezAcisi = scanner.nextDouble();

        // 𝜋 sayısını sabit olarak tanımlama
        final double PI = 3.14;

        // Daire dilimi alanını hesaplama
        double alan = (PI * yaricap * yaricap * merkezAcisi) / 360;

        // Sonucu ekrana yazdırma
        System.out.println("Daire Dilimi Alanı: " + alan);
    }
}
