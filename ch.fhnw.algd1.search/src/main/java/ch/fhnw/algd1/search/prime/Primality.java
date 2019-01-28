package ch.fhnw.algd1.search.prime;

public class Primality {
    public static boolean isPrime(int x) {
        // TODO (A2) implement search for dividing number



        /*if (x > 2) {

            for (int i = 2; 2 * i <= x; i++) {

                System.out.println("i: " + i + " x: " + x);


                if (x % i == 0) {

                    return false;
                }
            }

            return true;
        }
        return true;
*/

        int t = 4;
        System.out.println("testing: " + x);
        System.out.println((x > 1) || (x == 2) || (t < x) & (x % t >= 1));

        return ((x == 2) || (t < x) & (x % t >= 1));

    }


    public static boolean isPrimer(int x) {

        return (x % 2 == 0);
    }

}

        /*
        Algorithmus Naiver Primzahltest
        {prüft, ob eine gegebene Zahl n prim ist oder nicht}


        var prim : boolean;
        if n=2 then prim := true
        else if n gerade then prim := false else
        begin
        prim := true; √ fori:=1to⌊ n/2⌋do
        if (2i+1) teilt n then prim := false; end
        if prim then {n ist prim}
        else {nistnichtprim}
        end
        */