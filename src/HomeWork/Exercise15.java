//Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.
package HomeWork;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n:  ");
        n = in.nextInt();
        System.out.println("Введите число m:  ");
        m = in.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
                if (i < array[i].length && i <= j) {
                    for (int h = i; h >= 0; h--) {
                        array[h][j] = 1;
                    } //Работает при n>=m
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
