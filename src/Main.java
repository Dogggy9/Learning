import java.util.Scanner;

public class Main {
    public static String secret = "AmIgo";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.equalsIgnoreCase(secret))
            System.out.println("разрешен");
        else
            System.out.println("запрещен");
    }
}