import java.util.Scanner;

public class Method {


    int liczby() {
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
int x = 0;
        do {
            System.out.println("Podaj liczbę");
            liczba = scanner.nextInt();
            scanner.nextLine();
            if (liczba < 100) {
                System.out.println("liczba jest za mała");
                break;
            }
            if (liczba > 200) {
                System.out.println("liczba jest za duża");
            }
            if (liczba % 3 != 0) {
                System.out.println("liczba nie jest podzielna przez 3 ");
            }
            if (liczba>=100 && liczba<=200 && liczba%3==0)
            System.out.println("twoja liczba jest ok");

        }

        while (x==0);


        return liczba;
    }
}




