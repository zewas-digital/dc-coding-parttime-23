package judith.week14_objects;

public class Object_0_Person {
    public static void main(String[] args) {

        Person Roger = new Person();
        Roger.name = "Roger"; // dem Objekt "Roger" wird der Name "Roger" hinterlegt


        Person Peter = new Person("Peter");
        // Die Werte können in der Klammer nur hinterlegt werden wenn es in der Klasse definiert wurde das es möglich ist.
        // siehe Klasse Person Zeile (public Person (String name)
        // {this.name = name; } hiermit wird festgelegt das wenn in der Klammer ein Name eingegeben wurde dieser dann auch
        //den Wert "unbekannt" überschreiben soll. Also für diese einzelne Person nicht für die Vorlage.

        // aber ACHTUNG wenn in der Klasse (hier Person) die Konstruktoren "Vorlage" so angepasst wird das hier in der
        //Klammer Werte angegeben werden können gibt es auch einen Fehler bei den bereits erfassten
        // Daten die hier noch mit dem leeren Konstruktor angelegt wurden.
        //Problem entsteht meist dann wenn die Object Klasse im nachhinein nochmals verändert wurde / wird.


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
// wenn hier eine neue Person erstellt wird - hier Roger erbt er gleich alle Atribute die in der Classe Person angelegt und definiert wurden.
// somit ist bei jeder Person hier z.b. "Name Unbekannt" hinterlegt
// wird also Name fix hinterlegt wird bei jeder Person "Unbekannt" ausgegeben.
