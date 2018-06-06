package eu.sii.pl;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorize {

    public List<Integer> getPrimeFactors(Integer a) {
        if (a < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        List<Integer> list = new ArrayList<>();
        int divisor = 2;
        while (a > 1) {
            while (a % divisor == 0) {
                a = a / divisor;
                list.add(divisor);
            }
            divisor++;
        }
        return list;
    }

}
