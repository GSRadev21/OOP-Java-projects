import java.util.Scanner;

public class Picture {

    private String pictureName, authorName;
    private Integer year;
    private Double price;
    private Integer pictureID;

    public Picture() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the picture: ");
        this.pictureName = sc.nextLine();
        System.out.println("Enter the name of the author: ");
        this.authorName = sc.nextLine();
        System.out.println("Enter the year of creation/foundation: ");
        this.year = sc.nextInt();
        System.out.println("Enter the price of the picture: ");
        this.price = sc.nextDouble();
        System.out.println("Enter the ID of the picture: ");
        this.pictureID = sc.nextInt();
    }

    public String getPictureName() {
        return pictureName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Integer getYear() {
        return year;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getPictureID() {
        return pictureID;
    }

    public void displayPicture() {
        System.out.println("Picture Name: " + pictureName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Picture ID: " + pictureID);
    }
}
