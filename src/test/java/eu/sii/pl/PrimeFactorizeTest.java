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
        int numberToTest = 4;
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
        int numberToTest = 168;
        //when
        List<Integer> result = primeFactorize.getPrimeFactors(numberToTest);
        //then
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldCheckIsPrimeAndReturnTrue() {
        //given
        int a = 89;
        //when
        boolean actual = primeFactorize.isPrime(a);
        //then
        Assert.assertTrue(actual);

    }

    @Test
    public void shouldCheckIsPrimeAndReturnFalse() {
        //given
        int a = 90;
        //when
        boolean actual = primeFactorize.isPrime(a);
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void shouldGetNextPrime() {
        //given
        int a = 90;
        int expected = 97;
        //when
        int actual = primeFactorize.getNextPrime(a);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldGetNextPrimeNumberTwo() {
        //given
        int a = 1;
        int expected = 2;
        //when
        int actual = primeFactorize.getNextPrime(a);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        //given
        int a = -1;
        //when
        List actual = primeFactorize.getPrimeFactors(a);
    }
}