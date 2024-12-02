public class Calculator implements Addition{

    private int num1;
    private int num2;
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}
