package CompileTimePolimorfism;

public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double add(double x, double y, double z) {
        return x + y + z;
    }

    public int add(int x, int y){
        return x + y;
    }
}
