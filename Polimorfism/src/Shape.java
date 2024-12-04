interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw(); // Drawing a Circle

        shape = new Rectangle();
        shape.draw(); // Drawing a Rectangle
    }
}
