import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Movies Movies = new Movies();

        while (true) {

            System.out.println("Choose an option: ");
            System.out.println("1. Add a new Movie");
            System.out.println("2. Delete an existing Movie");
            System.out.println("3. Print all Movies by a year and a title");
            System.out.println("4. Print all Movies by year");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Movie Movie = new Movie();
                    Movies.addMovie(Movie);
                    break;
                case 2:
                    System.out.println("Enter the id");
                    Movies.delMovie();
                    break;
                case 3:
                    System.out.println("Enter a title and a year:");
                    Movies.displayMoviesByTitleAndYear();
                    break;
                case 4:
                    Movies.sortByYear();
                    break;
                default:
                    System.err.println("Please choose between given operations!");
            }
        }
    }
}