package claudia.week14_objects;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Claudia = new Person("Claudia");
        Person Roger = new Person();
        Roger.name = "Roger";
        Roger.age = 123;

        Person Peter = new Person("Peter", 15);
        Person Dirk = new Person();

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Roger
                +"\nDer Name der Person ist "+ Roger.name
                + " Alter: " + Roger.age
        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Peter
                        +"\nDer Name der Person ist "+ Peter.name
                        + " Alter: " + Peter.age + ". " + Peter.alter

        );

        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Dirk
                        +"\nDer Name der Person ist "+ Dirk.name
        );
        System.out.println(
                "Neues Objekt für eine Person erstellt: "+ Claudia
                        +"\nDer Name der Person ist "+ Claudia.name
        );
    }
}
