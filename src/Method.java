import java.util.Scanner;

public class Method {

    Scanner scanner = new Scanner(System.in);

    int liczby() {

        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();
        scanner.nextLine();

        while (liczba >= 100 && liczba <= 200 && liczba % 3 == 0) {
            System.out.println("twoja liczba jest ok");
            break;
        }
        if (liczba < 100) {
            System.out.println("liczba jest za mała");
            return liczby();
        } else if (liczba > 200) {
            System.out.println("liczba jest za duża");
            return liczby();
        }
        if (liczba % 3 != 0) {
            System.out.println("liczba nie jest podzielna przez 3 ");
            return liczby();
        }
        return 0;
    }
}




