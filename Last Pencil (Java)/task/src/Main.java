import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pencils would you like to use: ");
        int pencils = scanner.nextInt();

        System.out.print("Who will be the first (John, Jack): ");
        String name1 = scanner.next();
        String name2 = name1.equals("John") ? "Jack" : "John";

        while (pencils > 0) {
            System.out.println("|".repeat(pencils));
            System.out.println(name1 + "'s turn:");
            int remove = scanner.nextInt();
            pencils -= remove;
            if (pencils <= 0) {
                break;
            }
            String temp = name1;
            name1 = name2;
            name2 = temp;
        }
    }
}
