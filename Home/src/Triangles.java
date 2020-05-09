import java.util.Scanner;

public class Triangles {
    private static String symbol;
    private static int number;
    private static String [][] triangle;

    //Заполняет весь массив символом
    private  static  void fillTriangleBySymbol(String symbol) {
        for ( int i = 0; i < number; i++) {
            for (int j = 0; j < number; j ++ ) {
                triangle[i][j] = symbol;
            }
        }
    }

    private static void createPatternA() {
        fillTriangleBySymbol(symbol);
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < i; j++) {
                triangle[j][i] = " ";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите количество символ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        System.out.println("Введите  символ");
        symbol = scanner.next();
        triangle = new String[number][number];
        
        createPatternA();
        System.out.println(getTriangle());





            for (int i = 9; i == 0; i--){
                System.out.println(i);
            }
        }




    private static String getTriangle() {
        String output = "";
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                output += triangle[i][j];
            }
            output += "\n";
        }
        return output;
    }
}
