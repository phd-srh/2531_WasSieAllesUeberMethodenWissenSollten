public class Methoden {



    // Hauptmethode = Start des gesamten Programms
    public static void main(String[] args) {
        // hier steht der Programmcode, der immer
        // ausgeführt wird
        ausgabe( 17 );
        ausgabe( 3.14 );
        System.out.println( berechne( 7, 9 ) );
        System.out.println( fakultät(35) );
        System.out.println( fibonacci(8) );
        System.out.println( fibonacci(50) );
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
    // = Überladung

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
        if (n <= 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
