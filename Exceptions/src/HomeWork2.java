import sun.rmi.runtime.Log;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HomeWork2 extends Exception {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers for divided");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(divide(a, b));
        } catch (TrainingException e) {
            e.printStackTrace();
        }
    }

    private static double divide(int a , int b) throws TrainingException {
        try {
        if (b == 0)
            throw new NullPointerException("Делить на ноль нельзя");

            return (a / b);
        } catch ( ArithmeticException ex) {
            throw  new TrainingException(ex.getMessage());
        } catch (java.lang.Exception ex) {
            Logger.getLogger(java.lang.Exception.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }


}

class TrainingException extends Throwable {
    public  TrainingException() {
        super();
    }

    public TrainingException(String s) {
        super(s);
    }
}
