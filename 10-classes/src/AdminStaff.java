public class AdminStaff extends Employee{

    private long id;
    private int age;
    private String name;
    private String department;

    public AdminStaff(long id, String name, int age, String department) {

        super(id, name, age, department);
    }

    public void manageResources(){

        System.out.println("Admin manages resources");
    }
}
