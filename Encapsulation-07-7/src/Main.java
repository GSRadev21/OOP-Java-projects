public class Main{

    public static void main(String[] args){

        Student student = new Student();

        student.setName("Ivan");
        student.setRollNumber(1);
        System.out.println("The student's name is: " + student.getName());
        System.out.println("The student's roll number is: " + student.getRollNumber());
    }
}