package eu.sii.pl;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {

    private final Logger LOG = Logger.getLogger(App.class.toString());

    int numberToGetPrimeFactors;

    public void process() {
        do {
            System.out.println("Enter non-negative integer to see its prime factors, or 0 to exit: ");
            PrimeFactorize primeFactorize = new PrimeFactorize();
            Scanner scanner = new Scanner(System.in);
            try {
                numberToGetPrimeFactors = scanner.nextInt();
            } catch (InputMismatchException | IllegalArgumentException e) {
                LOG.log(Level.INFO, "entered value is not a positive java integer");
            }
            List<Integer> list = primeFactorize.getPrimeFactors(numberToGetPrimeFactors);
            list.forEach(System.out::println);
        } while (numberToGetPrimeFactors != 0);
    }
}
