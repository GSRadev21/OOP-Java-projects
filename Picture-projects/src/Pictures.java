import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
import  javax.sound.midi.*;

public class Pictures {

    private ArrayList<Picture> pictureList;
    private Scanner scanner = new Scanner(System.in);

    public Pictures() {
        pictureList = new ArrayList<>();
    }

    public ArrayList<Picture> getPictureList() {
        return pictureList;
    }

    public void addPicture(Picture picture) {

        for (Picture i : pictureList) {
            if (Objects.equals(i.getPictureID(), picture.getPictureID())) {
                System.err.println("The picture already exists!"); // Няма нужда от провека на другите елементи, защото ID се използва за подчертаване на уникалността на обекти, тоест е достатъчна проверка и моля да се зачете госпожо.
                break;
            }
        }
        pictureList.add(picture);
    }

    public void delPicture(Integer Id) {

        for(Picture i : pictureList) {
            if(i.getPictureID().equals(Id)) {
                System.err.println("The picture does not exists exists!");
                break;
            } else {

                pictureList.remove(i);
            }
        }
    }

    public void disPictureByAuthor() {
        String author;
        author = scanner.nextLine();
        for(Picture i : pictureList) {
            if(Objects.equals(author, i.getAuthorName()))  {
                i.displayPicture();
            }
        }
    }

    public void disPictureByPrice() {
        Double max = 0.0;
        for( Picture i : pictureList) {

            if (i.getPrice() > max) {
                max = i.getPrice();
            }
        }
        for( Picture i : pictureList) {

            if (Objects.equals(i.getPrice(), max)) {
                i.displayPicture();
            }
        }
    }

    public void findAveragePrice(ArrayList<Picture> pictureList) {
        int totalPrice = 0;
        for(int i = 0; i < this.pictureList.size(); i++) {
            totalPrice += this.pictureList.get(i).getPrice();
        }
        System.out.println("The avarege of all price is: " + totalPrice / this.pictureList.size());
    }

    public void disPriceOfPictureByAuthor() {

        int totalPrice = 0, counter = 0;
        boolean doesAuthorExists = false;
        String author;
        author = scanner.nextLine();
        for(Picture i : pictureList) {
            if(i.getAuthorName().equals(author)) {
                totalPrice += i.getPrice();
                doesAuthorExists = true;
                counter++;
            }
        }
        if(doesAuthorExists) {
            System.out.println("thte avarege price of " + author + " 's pictures in the list is: " + totalPrice / counter);
        } else {
            findAveragePrice(pictureList);
        }
    }
}
