package judith.week14_objects;

public class Person extends Object {
    // Attribute
    public String name = "unbekannt";
    public int age;
    public String alter;

    // Konstruktor wird beim Erzeugen der neuen Instanz mit new Person() aufgerufen
    public Person () { // Wenn zusätzlich wie hier eine "Leere" Vorlage (Klammer) definiert ist können die Parameter bei der Erstellung in der KLammer erfasst werden / muss aber nicht!

    }
    public Person (String name, int age) { // wenn in der Klammer im Nachhinein Werte ergänzt werden fordert das Progamm diese Werte bei jedem erstellen Projekt das
        this.name = name;                   // bereits erstellt wurde.
        this.age = age;
        this.alter = age +" Jahre";
    }
}