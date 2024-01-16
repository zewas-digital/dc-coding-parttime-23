package saifedine.week14_objects;

public class Person extends Object {

    // Attribute
    public String name = "unbekannt";
    public int age;                                     // 0
    public String alter;                                // null

    // Konstruktor ohne Parameter, wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () {
    }

    // Konstruktor mit Parameter, wird beim Erzeugen der neuen Instanz mit new Person(String name, int age) aufgerufen
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.alter = age +" Jahre";
    }
}