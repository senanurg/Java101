import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum gününüzün ayını girin (1-12): ");
        int ay = scanner.nextInt();

        System.out.print("Doğum gününüzün gününü girin: ");
        int gun = scanner.nextInt();

        String burc = "";

        switch (ay) {
            case 1:
                burc = (gun >= 20) ? "Kova" : "Oğlak";
                break;
            case 2:
                burc = (gun >= 19) ? "Balık" : "Kova";
                break;
            case 3:
                burc = (gun >= 21) ? "Koç" : "Balık";
                break;
            case 4:
                burc = (gun >= 20) ? "Boğa" : "Koç";
                break;
            case 5:
                burc = (gun >= 21) ? "İkizler" : "Boğa";
                break;
            case 6:
                burc = (gun >= 22) ? "Yengeç" : "İkizler";
                break;
            case 7:
                burc = (gun >= 23) ? "Aslan" : "Yengeç";
                break;
            case 8:
                burc = (gun >= 23) ? "Başak" : "Aslan";
                break;
            case 9:
                burc = (gun >= 23) ? "Terazi" : "Başak";
                break;
            case 10:
                burc = (gun >= 23) ? "Akrep" : "Terazi";
                break;
            case 11:
                burc = (gun >= 22) ? "Yay" : "Akrep";
                break;
            case 12:
                burc = (gun >= 22) ? "Oğlak" : "Yay";
                break;
            default:
                System.out.println("Hatalı giriş. Geçerli bir ay giriniz (1-12).");
                return;
        }

        System.out.println("Burcunuz: " + burc);
    }
}
