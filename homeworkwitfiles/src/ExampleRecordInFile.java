import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ExampleRecordInFile {


    private static final String str = "Record in file ";
    public static  void main(String [] args) {
        try {
            File file = new File("c:\\filename.txt");

            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
