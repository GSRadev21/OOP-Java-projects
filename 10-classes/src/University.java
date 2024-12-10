import java.util.ArrayList;

public class University {

    ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void listPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void displayActivity() {
        for (Person person : people) {
            person.work();
        }
    }
}
