import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import objects.Human;

import java.lang.reflect.Array;

import static jdk.nashorn.internal.objects.Global.print;

public class TestArrays {

    public static void main (String[] args) {
        int[] numbers1 = new int[5];
        System.out.println("Hell");
        print(numbers1);

        numbers1[4] = 5;
        print(numbers1);


        Object[] objects1 = new Object[]{"one", "two", "three", new Human("Sniff", 56)};
        Object[] objects2 = new Object[]{'a', 34.2, 0.222};
        System.out.println("Массивы обьектов");
        print(objects1);
        print(objects2);


        Human[] humans = new Human[4];
        humans[0] = new Human ("name1", 25);
        humans[2]  = new Human ("name3", 30);
        print(humans);

        //двумерный массив
        int [][] tableOne = new int[][] {{1, 2, 3, 4, 5 }, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        System.out.println("Перебор двумерного массива");
        print(tableOne);

        int[][] table2 = new int [2][3];
        table2[0][0] = 10;
        table2[1][1] = 14;
        table2[1][2] = 46;
        System.out.println();
        print(table2);

    }

    private static void print(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " " );
        }
        System.out.println();
    }
    private static void print(Object[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " " );
        }
        System.out.println();
    }


    private static void print (int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for(int j = 0 ; j < mass[i].length; j++){
                System.out.print(mass[i][j] + " " );
            }
            System.out.println();
        }
    }

}
