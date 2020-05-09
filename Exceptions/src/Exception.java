import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception  {

    public static void main(String [] args ) {

//        try {
//            System.out.println(1 / 0);
//        } catch (RuntimeException ex) {
//            Logger.getLogger(RuntimeException.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(Exception.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Error ex) {
//            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
//        }


        try {
            System.out.println(1 / 0);
        } catch (Throwable ex) {
            Logger.getLogger(Throwable.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
