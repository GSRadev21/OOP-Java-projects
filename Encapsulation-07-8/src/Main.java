public class Main {

    public static void main(String[] args) {

       Person person1 = new Person("Boiko","Borisov", 65, 6543.21);
       Person person2 = new Person("Kornelia","Ninova", 55, 6543.21);
       Person person3 = new Person("Hristo","Ivanov", 50, 6543.21);
       Person person4 = new Person("Flora","Stratieva", 26, 6543.21);

       person1.increaseSalary();
       person2.increaseSalary();
       person3.increaseSalary();
       person4.increaseSalary();

       System.out.println(person1.toString());
       System.out.println(person2.toString());
       System.out.println(person3.toString());
       System.out.println(person4.toString());

    }
}