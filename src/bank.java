import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz saldo bankowe");
        int cash = scanner.nextInt();
        System.out.println("Chcesz wpłacić podaj kwotę, chcesz wypłacić podaj kwotę z minusem");
        int money = scanner.nextInt();
        if (0 >= money){
            System.out.println("Poszło");
        } else if
        ((cash + money)<0){
            System.out.println("Błąd. Za duża kwota");
        }

    }
}