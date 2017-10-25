import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String occupation;


    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String toString() {
        return "Name: " + this.name + " Age: " + this.age + " Occupation: " + this.occupation;
    }

    public String getName() {
        return this.name;
    }

}
