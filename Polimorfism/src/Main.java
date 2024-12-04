import CompileTimePolimorfism.Calculator;
import RuntimePolymorfismus.Animal;
import RuntimePolymorfismus.Cat;
import RuntimePolymorfismus.Dog;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10.3, 20.4));
        System.out.println(calculator.add(1.2,2.2,3.2));
        System.out.println(calculator.add(1,2));

        Animal myAnimal; // Полиморфично поле/променлива
        myAnimal = new Dog();
        myAnimal.makesSound(); // Barks (метода е преизползван)
        myAnimal = new Cat();
        myAnimal.makesSound(); // Meow (метода е преизползван)

        Shape myShape;
        myShape = new Circle();
        myShape.draw();
        myShape = new Rectangle();
        myShape.draw();
    }
}