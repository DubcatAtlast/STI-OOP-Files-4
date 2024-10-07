import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {
    public static void main(String[] args) {
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 movies you would like to watch:");
        for (int i = 0; i < 3; i++) {
            String movie = scanner.nextLine();
            movies.add(movie);
        }

        System.out.println("Enter 3 snacks or beverages you would like to enjoy:");
        for (int i = 0; i < 3; i++) {
            String snack = scanner.nextLine();
            snacks.add(snack);
        }

        System.out.println("\nMovies to watch:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nSnacks to enjoy:");
        for (String snack : snacks) {
            System.out.println(snack);
        }

        while (!snacks.isEmpty()) {
            System.out.println("\nType 'S' when done eating a snack:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("S")) {
                snacks.poll();
                if (!snacks.isEmpty()) {
                    System.out.println("Remaining snacks:");
                    for (String remainingSnack : snacks) {
                        System.out.println(remainingSnack);
                    }
                } else {
                    System.out.println("No more snacks.");
                }
            }
        }

        scanner.close();
    }
}
