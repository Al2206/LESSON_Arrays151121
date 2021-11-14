// 7) Сформировать двумерный массив размером 10*10.
// Найти минимальный и максимальный элемент на экран
package HomeWork;
import java.util.Arrays;
public class Exercise7 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int min = 1000, max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 1000) + 1);
                if (array[i][j] < min) {
                    min = array[i][j];
                } else if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MIN = " + min + "\n" + "MAX = " + max);
    }
}
