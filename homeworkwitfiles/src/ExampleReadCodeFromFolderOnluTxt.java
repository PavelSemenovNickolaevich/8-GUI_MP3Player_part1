import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class ExampleReadCodeFromFolderOnluTxt {
// фильтрация  файлов
    public static void main (String[] args) {
        File dir = new File("c:\\test\\");

        FilenameFilter customFilter =  new CustomFileFilter("txt");

        System.out.println("Файлы с расширением txt");
        for (String fileName: dir.list(customFilter)) {
            System.out.println(fileName);
        }

    }
}
