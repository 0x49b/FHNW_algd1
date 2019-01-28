package src.ch.fhnw.algd1.search.prime;

public class PrimeCheck {

    public boolean checkNumberForPrime(int x) {
        int t = 2;
        while (t * t <= x && x % t != 0) {
            t++;
        }
        return t * t > x;
    }
}
