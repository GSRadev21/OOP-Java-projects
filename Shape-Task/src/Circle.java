public class Circle implements Shape{

    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return Math.PI * radius * 2;
    }
}
