package eslem.week14;

public class Person extends Object {
    // Attribute = Eigenschaften

    public String name = "unbekannt";
    public String alter;
    public int age;

    public Person() {

    }
    public Person(String name, int age){
        this.name = name;
        this.alter = age + " Jahre";
        this.age = age;
    }
}