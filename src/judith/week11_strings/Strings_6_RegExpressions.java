package judith.week11_strings;

/*
Aufgabe: Email Regex aka. Regbert
Erstelle einen regulären Ausdruck (Regular Expression) für Email Adressen.

String regex = "[richtiger Regex hier]";

Beispiele:

Aufruf          System.out.println("alfons@drlue.at".matches(regex));          Ausgabe          true

Aufruf          System.out.println("rambina.alfons@drlue.at".matches(regex));          Ausgabe          true

Aufruf          System.out.println("rambina1.1alfons@drlue.at".matches(regex));          Ausgabe          true

Aufruf          System.out.println("1rambina1.alfons@drlue.at".matches(regex));          Ausgabe          false

Aufruf          System.out.println("@drlue.at".matches(regex));          Ausgabe          false

Aufruf          System.out.println("drlue.at".matches(regex));          Ausgabe          false

Aufruf          System.out.println("asdf@drlue".matches(regex));          Ausgabe          false

Aufruf          System.out.println("asdf@microsoft.c".matches(regex));          Ausgabe          false
 */
public class Strings_6_RegExpressions {

    public static void main(String[] args) {
        // Beispiel 1 -------------------
        String sample = "Beispiel";
        System.out.println(
                "Das Wort \"Beispiel\" besteht aus Groß- und/oder Kleinbuchstaben: " +
                        sample.matches("^[a-zA-Z]+")
                // Hierbei wird nur abgefragt ob NUR klein und Großbuchstaben enthalten sind
        );
        System.out.println(
                "Das Wort \"Beispiel\" besteht aus Groß- und/oder Kleinbuchstaben und/oder Zahlen: " +
                        sample.matches("^[a-zA-Z0-9]+")
                // Hier dürfen klein und großbuchstaben und zahlen enthalten sein
        );
        System.out.println(
                "Das Wort \"Beispiel\" besteht aus Kleinbuchstaben und/oder Zahlen und/oder einem Punkt: " +
                        sample.matches("^[a-z0-9.]+")
                //Hier dürfen kleinbuchstaben und Zahlen enthalten sein
        );
        System.out.println("-".repeat(32));

        // Beispiel 2 -------------------
        String sample2 = "Beispiel2";
        System.out.println(
                "Das Wort \"Beispiel2\" besteht aus mindestens einem Buchstaben und einer folgenden Zahl: " +
                        sample2.matches("^[a-zA-Z]+[0-9]+")
                // Hier dürfen klein und großbuchstaben und eine Zahl im Anschluss enthalten sein
        );
        System.out.println("-".repeat(32));

        // Beispiel 3 -------------------
        String sample3 = "Beispiel!3";
        System.out.println(
                "Das Wort \"Beispiel!3\" besteht aus Buchstaben, einem Rufzeichen und einer Zahl: " +
                        sample3.matches("^[a-zA-Z]+![0-9]$")
                //Hier dürfen klein und großbuchstaben sein im Anschluss muss ein "!" folgen und dann eine Zahl
        );
        System.out.println(
                "Das Wort \"Beispiel!3\" besteht aus 2-3 Buchstaben, einem Rufzeichen und einer Zahl: " +
                        sample3.matches("^[a-z]{2,3}[A-Z]{2,3}![0-9]$")
                //hier dürfen es 2-3 kleinbuchstaben sein gefolgt von 2-3 Großbuchstaben, einem "!" und dann einer Zahl (hier darf es nur eine Zahl sein dahinter definiert ist das "$" bedeutet nur bis zum Ende des Strings
        );
        System.out.println("-".repeat(32));

        // Aufgabe -------------------
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        System.out.println("alfons@drlue.at".matches(regex));
        System.out.println("rambina.alfons@drlue.at".matches(regex));
        System.out.println("rambina1.1alfons@drlue.at".matches(regex));
        System.out.println("1rambina1.alfons@drlue.at".matches(regex));
        System.out.println("@drlue.at".matches(regex));
        System.out.println("drlue.at".matches(regex));
        System.out.println("asdf@drlue".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));
        
    }
}
