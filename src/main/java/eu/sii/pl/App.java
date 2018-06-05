package eu.sii.pl;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter non-negative integer to see its prime factors: ");
        PrimeFactorize primeFactorize = new PrimeFactorize();
        Scanner scanner = new Scanner(System.in);
        int numberToGetPrimeFactors = scanner.nextInt();
        List<Integer> list = primeFactorize.getPrimeFactors(numberToGetPrimeFactors);
        list.forEach(System.out::println);
    }
}
