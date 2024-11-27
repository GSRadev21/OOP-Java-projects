public abstract  class Animal {

    private static  double speed;
    private static int age;
    private static boolean hasOwner;
    private String gender;

    public Animal(double speed, int age, boolean hasOwner, String gender) {

        this.speed = speed;
        this.age = age;
        this.hasOwner = hasOwner;
        this.gender = gender;
    }

    public double getSpeed(double speed){
        return speed;
    }

    public int getAge(int age) {
        return Animal.age;
    }
    public boolean hasOwner(boolean hasOwner) {
        return Animal.hasOwner;
    }
    public String getGender(String gender) {
        return gender;
    }

    public String stageOfLife(int age){

       switch (this.age){
           case -2: return "This is a puppy!";
           case 2-6: return "This is a dog!";
           default: return "This is an adult dog!";
       }
    }

    public void breathe(){

        System.out.println("It breathes!");
    }

    public void sleep(){
        System.out.println("It sleeps!");
    }

    public void eat(){
        System.out.println("It eats!");
    }
}
