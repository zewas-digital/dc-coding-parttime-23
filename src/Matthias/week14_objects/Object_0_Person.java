package Matthias.week14_objects;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Roger = new Person();
        Roger.name = "Roger";
        Person Peter = new Person("Peter");
        Person Dirk = new Person();

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Roger
                +"\nDer Name der Person ist "+ Roger.name
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Peter
                        +"\nDer Name der Person ist "+ Peter.name
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Dirk
                        +"\nDer Name der Person ist "+ Dirk.name
        );
    }
}
