//Сформировать двумерный массив размером 10*10. Вывести на экран матрицу.
package HomeWork;

public class Exercise8 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 999) + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}