public class Faculty extends Employee{

    private long id;
    private int age;
    private String name;
    private String department;
    private String title;

    public Faculty(long id, String name, int age, String department, String title) {

        super(id, name, age, department);
        this.title = title;
    }

    public void teach(){
        System.out.println("I am teaching as " + department + "teacher");
    }
}
