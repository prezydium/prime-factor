package eu.sii.pl;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorizeTest {

    private PrimeFactorize primeFactorize;

    @Before
    public void setUp() {
        primeFactorize = new PrimeFactorize();
    }

    @Test
    public void shouldReturnTwoAndTwo() {
        //given
        List<Integer> expected = new ArrayList<Integer>() {{
            add(2);
            add(2);
        }};
        int numberToTest = 2*2;
        //when
        List<Integer> result = primeFactorize.getPrimeFactors(numberToTest);
        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldReturnPrimeFactors() {
        //given
        List<Integer> expected = new ArrayList<Integer>() {{
            add(2);
            add(2);
            add(2);
            add(3);
            add(7);
        }};
        int numberToTest = 2*2*2*3*7;
        //when
        List<Integer> result = primeFactorize.getPrimeFactors(numberToTest);
        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
        //given
        int a = -1;
        //when
        List actual = primeFactorize.getPrimeFactors(a);
    }
    @Test(expected = NumberFormatException.class)
    public void shouldThrowNumberFormatException(){
        primeFactorize.getPrimeFactors(Integer.valueOf("99999999999999999999999"));
    }
}