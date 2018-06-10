import java.util.Scanner;

public class Method2 {


    int liczby() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();
//        scanner.nextLine();

        while (liczba < 100 || liczba > 200 || liczba % 3 != 0) {
            if (liczba < 100) {
                System.out.println("liczba jest za mała");
            }
            if (liczba > 200) {
                System.out.println("liczba jest za duża");
            }
            if (liczba % 3 != 0) {
                System.out.println("twoja liczba nie jest podzielna prez 3");
            }
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
        }
        System.out.println("twoja liczba jest ok");
        return liczba;
    }
}





