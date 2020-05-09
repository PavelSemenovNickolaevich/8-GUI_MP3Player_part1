import sun.reflect.misc.FieldUtil;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;

public class StatisticAboutFileFromFolder {
    public static void main(String[] args) {
        File dir = new File("c:\\");


        HashSet<String> exList = new HashSet<>();
        for (String  fileName: dir.list() ) {

            File file  = new File(dir.getAbsolutePath() + "\\" + fileName);

            int i = fileName.lastIndexOf(".");
            if (file.isFile() && i != -1) {
                exList.add(fileName.substring(i+1,fileName.length()).toLowerCase());
            }

            System.out.println("Статистика по расширения файлов для папки" + dir.getAbsolutePath() + " :");

            for (String ext: exList) {
                FilenameFilter filter = new CustomFileFilter(ext);
                System.out.println("." + ext + ": " + dir.listFiles(filter).length);
            }


        }

    }
}


