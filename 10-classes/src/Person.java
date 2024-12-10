public abstract class Person {

    private long id;
    private int age;
    private String name;

    Person(long id, int age, String name) {

        this.id = id;
        this.age = age;
        this.name = name;
    }

   abstract void introduce(int age, String name);

   abstract void work();
}
