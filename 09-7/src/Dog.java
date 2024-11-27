public class Dog extends Animal {

    private static  double speed;
    private static int age;
    private static boolean hasOwner;
    private String gender;

    public Dog(double speed, int age, boolean hasOwner, String gender) {
        super(speed,age,hasOwner,gender);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public double getSpeed(double speed) {

        return super.getSpeed(speed);
    }

    @Override
    public int getAge(int age) {

        return super.getAge(age);
    }

    @Override
    public boolean hasOwner(boolean hasOwner) {
        return super.hasOwner(hasOwner);
    }

    @Override
    public String getGender(String gender) {
        return super.getGender(gender);
    }

    @Override
    public String stageOfLife(int age){

        return super.stageOfLife(age);
    }

    @Override
    public void breathe(){

        super.breathe();
    }

    @Override
    public void sleep(){
        super.sleep();
    }
}
