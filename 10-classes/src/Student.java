public class Student extends Person {

    private long id;
    private int age;
    private String name;
    private String major;

    public Student(long id, String name, int age, String major) {

        super(id, age, name);
        this.major = major;
    }

    @Override
    public void introduce(int age, String name) {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }

    public void study(){
        System.out.println("I am studying " + major + "major.");
    }

    @Override
    public void work(){
        System.out.println(0);
    }
}
