package oliver.week11_strings;

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
        );
        System.out.println(
                "Das Wort \"Beispiel\" besteht aus Groß- und/oder Kleinbuchstaben und/oder Zahlen: " +
                        sample.matches("^[a-zA-Z0-9]+")
        );
        System.out.println(
                "Das Wort \"Beispiel\" besteht aus Kleinbuchstaben und/oder Zahlen und/oder einem Punkt: " +
                        sample.matches("^[a-z0-9.]+")
        );
        System.out.println("-".repeat(32));

        // Beispiel 2 -------------------
        String sample2 = "Beispiel2";
        System.out.println(
                "Das Wort \"Beispiel2\" besteht aus mindestens einem Buchstaben und einer folgenden Zahl: " +
                        sample2.matches("^[a-zA-Z]+[0-9]+")
        );
        System.out.println("-".repeat(32));

        // Beispiel 3 -------------------
        String sample3 = "Beispiel!3";
        System.out.println(
                "Das Wort \"Beispiel!3\" besteht aus Buchstaben, einem Rufzeichen und einer Zahl: " +
                        sample3.matches("^[a-zA-Z]+![0-9]$")
        );
        System.out.println(
                "Das Wort \"Beispiel!3\" besteht aus 2-3 Buchstaben, einem Rufzeichen und einer Zahl: " +
                        sample3.matches("^[a-z]{2,3}[A-Z]{2,3}![0-9]$")
        );
        System.out.println("-".repeat(32));

        // Aufgabe -------------------
        String regex = "[richtiger Regex hier]";
        System.out.println("rambina.alfons@drlue.at".matches(regex));
    }
}
