package pl.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pierwiastek {
    public double  sqrt(Double pier){
        if(pier < 0) {
            throw new IllegalArgumentException("Number for sqrt must be grater than zero");
        }
        return Math.sqrt(pier);
    }
}
