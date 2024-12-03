public class Animal {

    private String name;
    private String type;
    private String sound;
    private int age;

    public Animal(String name, String type, int age, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType(){
        return type;
    }

    public int getAge(){
        return age;
    }

    public void makeSound(){
        System.out.println(sound);
    }
}
