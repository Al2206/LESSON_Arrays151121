// 7) Сформировать двумерный массив размером 10*10.
// Найти минимальный и максимальный элемент на экран
package HomeWork;

public class Exercise7 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 999) + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            int min = array[0][0];
            for (i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                    }
                }
            }
            System.out.println("MIN = " + min + "\n" + "MAX = " + max);
        }
        System.out.println();
    }
}
