package pl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main extends Pierwiastek{
    public static void main(String[] args) {
        System.out.println("Podaj liczbe do spierwiastkowania");
        Scanner myScanner = new Scanner(System.in);
        Pierwiastek ku = new Pierwiastek();
        Double x = null;
        double xD;
            try {
                x = myScanner.nextDouble();
            }
            catch (InputMismatchException e) {
                while(true) {
                    System.out.println("Powiedziałem numer! Nie ma żadnych słow, weź wprowadź jakieś cyferki!");
                    Scanner mySecScanner = new Scanner(System.in);
                    if(mySecScanner.hasNextDouble()) {
                        x = mySecScanner.nextDouble();
                        break;
                    }
                }
            }
        try {
            xD = ku.sqrt(x);
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Kto to widział, żeby pierwiastkować minusa! Przemnożyłem przez -1");
            xD = ku.sqrt(x*-1);
        }
        System.out.println(xD);

    }
}
