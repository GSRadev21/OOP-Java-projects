public class StudentGrades {

    private String name;
    private int age;
    private double grade;

    public StudentGrades(String name, int age, int grade) {
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getGrade(){
        return grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){

        if(age >= 18 && age <= 30) {
            this.age = age;
        }

    }

    public void setGrade(int grade) {

        if (grade >= 2.00 && grade <= 6.00) {
            this.grade = grade;
        }
    }
}
