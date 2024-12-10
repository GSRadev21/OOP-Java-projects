public class Employee extends Person {

    private long id;
    private int age;
    private String name;
    private String department;

    public Employee(long id, String name, int age, String department) {

        super(id, age, name);
        this.department = department;
    }


    @Override
    public void introduce(int age, String name) {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }

    public void performDuties(){
        System.out.println("My duty is to save the world!");
    }

    @Override
    public void work(){
        System.out.println("I am working in " + department + " department.");
    }
}
