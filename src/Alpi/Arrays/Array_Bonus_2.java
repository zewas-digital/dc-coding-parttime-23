package Alpi.Arrays;

/*

        Klasse: Array_Bonus_2

        Beschreibung:

        Diese Klasse enthält einen Algorithmus zur Sortierung eines Arrays mit der Insertion-Sort-Methode.

        Methoden:

        main():
        Die main()-Methode ist der Einstiegspunkt in das Programm. Sie erstellt ein unsortiertes Array und
            sortiert es dann mit der Insertion-Sort-Methode. Das sortierte Array wird dann ausgegeben.

        insertionSort():
        Die insertionSort()-Methode sortiert ein Array mit der Insertion-Sort-Methode.
        Die Methode durchläuft das Array von hinten nach vorne. Bei jedem Durchlauf wird das aktuelle
        Element an der richtigen Position in das bereits sortierte Array eingefügt.
 */


     /*   Parameter:

        sortieren: Das Array, das sortiert werden soll.
        Rückgabewert:

        Das sortierte Array.

        Implementierung:


      */

public class Array_Bonus_2 {


    /**
     * Beschreibung:
     * <p>
     * Diese Methode ist der Einstiegspunkt in das Programm.
     * Sie erstellt ein unsortiertes Array und sortiert es dann mit der Insertion-Sort-Methode.
     * Das sortierte Array wird dann ausgegeben.
     * <p>
     * Parameter:
     * <p>
     * args: Die Kommandozeilenargumente.
     */

    public static void main(String[] args) {

        // Erstelle ein unsortiertes Array
        int[] unsortiert = {4, 1, 8, -3, 5, 7, 9, 12, 45, 13};



        // Sortiere das Array
        int[] sortiert = insertionSort(unsortiert);



        // Gebe das sortierte Array aus
        for (int i = 0; i < sortiert.length; i++) {
            System.out.print(sortiert[i] + "   ");
        }

    }


    /*
     * Beschreibung:
     * <p>
     * Diese Methode sortiert ein Array mit der Insertion-Sort-Methode.
     * Die Methode durchläuft das Array von hinten nach vorne.
     * Bei jedem Durchlauf wird das aktuelle Element an der richtigen
     * Position in das bereits sortierte Array eingefügt.
     * <p>
     * Parameter:
     * <p>
     * sortieren: Das Array, das sortiert werden soll.
     * <p>
     * Rückgabewert:
     * <p>
     * Das sortierte Array.
     **/
    public static int[] insertionSort(int[] sortieren) {

        // Variablendeklaration
        int temp;
        int j;

        // Durchlaufe das Array von hinten nach vorne
        for (int i = 1; i < sortieren.length; i++) {

            // Speichere das aktuelle Element
            temp = sortieren[i];

            // Starte den Suchlauf
            j = i;

            // Suche nach der richtigen Position für das aktuelle Element
            while (j > 0 && sortieren[j - 1] > temp) {


                // Verschiebe das aktuelle Element nach hinten
                sortieren[j] = sortieren[j - 1];

                // Verringere den Suchindex
                j--;

            }


            // Füge das aktuelle Element an der richtigen Position ein
            sortieren[j] = temp;

        }
                // Gebe das sortierte Array zurück
                return sortieren;



            }



    }











    /*Diese Dokumentation enthält die folgenden Informationen:

        Beschreibung: Eine kurze Beschreibung des Zwecks der Klasse oder Methode.
        Parameter: Eine Liste der Parameter der Klasse oder Methode, einschließlich ihrer Beschreibung und Datentyp.
        Rückgabewert: Eine Beschreibung des Rückgabewerts der Klasse oder Methode.
        Implementierung: Eine kurze Beschreibung der Implementierung der Klasse oder Methode.
        Zusätzliche Informationen, die in die Dokumentation aufgenommen werden können, sind:

        Voraussetzungen: Bedingungen, die erfüllt sein müssen, bevor die Klasse oder Methode verwendet werden kann.
        Nachteile: Mögliche Nachteile der Verwendung der Klasse oder Methode.
        Beispiele: Beispiele für die Verwendung der Klasse oder Methode.
        Die Dokumentation kann in einer separaten Datei oder direkt im
        Quellcode der Klasse oder Methode enthalten sein.
     */