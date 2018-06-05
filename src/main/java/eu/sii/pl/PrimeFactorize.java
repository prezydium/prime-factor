package eu.sii.pl;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorize {

    public List<Integer> getPrimeFactors(int a) {
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while (a > 1) {
            while (a % divisor == 0) {
                a = a / divisor;
                list.add(divisor);
            }
            divisor = getNextPrime(divisor);
        }
        return list;
    }

    public int getNextPrime(int a) {
        a++;
        while (!isPrime(a)) a++;
        return a;
    }

    public boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}
