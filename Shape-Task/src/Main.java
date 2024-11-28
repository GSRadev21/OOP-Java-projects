import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){

        ArrayList<Shape> shapes = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the circle's radius: ");
        int radius = scanner.nextInt();
        System.out.println("Enter the rectangle's width: ");
        int recWidth = scanner.nextInt();
        System.out.println("Enter the rectangle's height: ");
        int recHeight = scanner.nextInt();
        System.out.println("Enter the triangle's sideA length: ");
        double triangleSideA = scanner.nextDouble();
        System.out.println("Enter the triangle's sideB length: ");
        double triangleSideB = scanner.nextDouble();
        System.out.println("Enter the triangle's sideC length: ");
        double triangleSideC = scanner.nextDouble();

        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(recWidth, recHeight);
        Triangle triangle = new Triangle(triangleSideA,triangleSideB,triangleSideC);

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for(int i = 0; i < shapes.size(); i++){

            System.out.println(df.format(shapes.get(i).calculatePerimeter()));
            System.out.println(df.format(shapes.get(i).calculateArea()));
        }
    }
}