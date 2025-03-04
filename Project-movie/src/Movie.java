import java.util.Scanner;

public class Movie {

    Scanner sc = new Scanner(System.in);

    private String title;
    private String type;
    private Integer year;
    private Double runtime;
    private Long id;

    public Movie() {
        System.out.println("Enter the movie's title: ");
        this.title = sc.nextLine();
        System.out.println("Enter the movie's type: ");
        this.type = sc.nextLine();
        System.out.println("Enter the movie's come out year: ");
        this.year = sc.nextInt();
        System.out.println("Enter the movie's runtime: ");
        this.runtime = sc.nextDouble();
        System.out.println("Enter the movie's ID: ");
        this.id = sc.nextLong();
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Integer getYear() {
        return year;
    }

    public Double getRuntime() {
        return runtime;
    }

    public Long getId() {
        return id;
    }

    public void displayMovie() {
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
        System.out.println("Runtime: " + runtime);
        System.out.println("ID: " + id);
    }
}
