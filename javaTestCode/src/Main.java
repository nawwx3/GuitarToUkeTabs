import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Guitar guitar = new Guitar();


        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        System.out.println(input);

        String fart = guitar.getLowENote(input);
        System.out.println(fart);

    }
}
