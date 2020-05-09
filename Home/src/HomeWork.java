import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HomeWork {


    public static void main(String[] args) {
        System.out.println("Введите  размер массива :");
        Scanner scan = new Scanner(System.in);
        int arrayLength = scan.nextInt();
        Integer[] arrayHome = new Integer[arrayLength];
        System.out.println("Заполните массив :");
        for (int i = 0; i < arrayHome.length; i++) {
            arrayHome[i] = scan.nextInt();
        }
        int sum = calcSum(arrayHome);
        double average = average(arrayHome, sum);


        System.out.println(Arrays.toString(arrayHome));
        System.out.println("Сумма элементов масива " + sum);
        System.out.println("Среднее значение " + average);
        System.out.println("Отсортированный массив по возрастанию: ");
        Arrays.sort(arrayHome);
        System.out.print(Arrays.toString(arrayHome));
        System.out.println();
        System.out.println("Отсортированный массив по убыванию: ");
        Arrays.sort(arrayHome, Collections.reverseOrder());
        System.out.print(Arrays.toString(arrayHome));
        System.out.println();
        System.out.println("Только четные числа: ");
        outEvenNumbers(arrayHome);
        System.out.println();
        System.out.println("Только НЕчетные числа: ");
        outNoEvenNumbers(arrayHome);


    }

    private static void outNoEvenNumbers(Integer[] arrayHome) {
        for (int i = 0; i < arrayHome.length; i++) {
            if (arrayHome[i] % 2 != 0) {
                System.out.print(arrayHome[i] + " ");
            }
        }
    }

    private static double average(Integer[] arrayHome, int sum) {
        return sum / arrayHome.length;
    }


    private static int calcSum(Integer[] arrayHome) {
        int sum = 0;
        for (int i = 0; i < arrayHome.length; i++) {
            sum = arrayHome[i] + sum;
        }
        return sum;
    }

    private static void outEvenNumbers(Integer[] arrayHome) {
        for (int i = 0; i < arrayHome.length; i++) {
            if (arrayHome[i] % 2 == 0) {
                System.out.print(arrayHome[i] + " ");
            }
        }
    }


}
