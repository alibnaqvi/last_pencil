import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pencils would you like to use: ");
        int pencils = scanner.nextInt();

        System.out.print("Who will be the first (John, Jack): ");
        String name = scanner.next();

        System.out.println("|".repeat(pencils));

        System.out.println(name + " is going first!");
    }
}
