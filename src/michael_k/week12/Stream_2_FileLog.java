package michael_k.week12;

/*
Aufgabe: Erstelle eine Klasse für Log-Einträge
Der Logger schreibt fortlaufend in eine Datei. Es wird nicht überschrieben.

Verwende den Methoden-Paramter severity (Schweregrad)

   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

Ergebnis:
   2023-11-30 19:30:34 INFO: Guten Morgen!
   2023-11-30 19:31:01 WARNING: Kein passende Aufgabe gefunden
   ...
*/
public class Stream_2_FileLog {
    public static void main(String[] args) {
        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception ec){
            // TODO schreibe log-eintrag mit der geworfenen Exception
        }
    }
    public static void log(int severity, String message) {

    }
}
