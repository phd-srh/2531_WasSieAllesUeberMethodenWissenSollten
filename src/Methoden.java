public class Methoden {

    // Einsatz einer globalen Variable
    public static long anzahlAufrufe = 0;

    // Hauptmethode = Start des gesamten Programms
    public static void main(String[] args) {
        // hier steht der Programmcode, der immer
        // ausgeführt wird
        ausgabe( 17 );
        ausgabe( 3.14 );
        System.out.println( berechne( 7, 9 ) );
        System.out.println( fakultät(35) );
//        System.out.println( fibonacci(8) );
        System.out.println( fibonacci(42) );
        System.out.println("Anzahl der Aufrufe: " + anzahlAufrufe);

        int x = 3; // und wieder eine "lokale" Variable
        testeMich(x);
        System.out.println("x im Hauptprogramm hat den Wert " + x);

        int[] array = { 1, 2, 3, 4, 5 };
        testeMich(array);
        System.out.println("array an der Stelle 0 hat den Wert " + array[0]);
    }

    // Methode = Funktion, Prozedur, Unterprogramm, Subroutine

    // Aufbau:
    // Methodenkopf + Methodenrumpf
    // Methodenkopf = Sichtbarkeit (public) + Modifikator (static)
    //                      Datentyp
    // (Methodensignatur=)  Methodenname "(" Parameterliste ")"

    // Parameterliste = Datentyp Parametername (= formale Variable)

    // Es können mehrere Methoden mit dem selben Namen existieren,
    // wenn sich die Datentypen der Parameter unterscheiden
    // d.h. ihre Signaturen sind unterschiedlich
    // = Überladung

    // Der Parameter "x" wird per Call-By-Value übertragen,
    // d.h. es handelt sich um eine neue und unabhängige Variable!
    // Call-By-Value wird bei allen primitiven Datentypen verwendet
    // das sind: boolean, byte, short, char,  int, long, float, double
    public static void testeMich(int x) { // x = formale Variable
        x++;
        System.out.println("x hat jetzt den Wert " + x);
    }

    // Der Parameter "x" wird per Call-By-Reference übertragen,
    // d.h. es handelt sich um die identische Variable des Aufrufers!
    // Call-By-Reference wird bei allen nicht primitiven Datentypen verwendet
    // Ist sehr gefährlich, weil ich die Daten des Aufrufers verändern kann!!
    public static void testeMich( int[] x ) {
        x[0]++;
        System.out.println("x an der Stelle 0 hat jetzt den Wert " + x[0]);
    }

    public static void ausgabe( int wert ) {
        System.out.println("Der Wert beträgt " + wert);
    }
    public static void ausgabe( double wert ) {
        System.out.println("Der Wert beträgt " + wert);
    }
    public static int berechne( int a, int b, int c ) {
        System.out.println("Aufruf der Methoden mit 3 Parameter");
        return a * b + c;
    }
    // gleiche Methoden mit einem Parameter weniger,
    // weil z.B. der letzte Parameter oftmals nur Null ist
    public static int berechne( int a, int b ) {
        System.out.println("Aufruf der Methoden mit 2 Parameter");
        return berechne(a, b, 0);
    }

    // Rekursion 1. Ordnung
    public static long fakultät(long n) {
        if (n == 1) return 1;
        return n * fakultät(n-1);
    }

    // Rekursion 2. Ordnung
    public static long fibonacci(long n) {
        anzahlAufrufe++;
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Grundregel:
    // Rekursive Methoden sind klein und knapp und elegant formuliert,
    // sind aber im Einsatz sehr teuer (viel Zeit + Speicherplatz)
    // -> Hausaufgabe: Die Fibonacci-Zahl iterativ berechnen!
}
