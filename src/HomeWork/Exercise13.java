//  В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
package HomeWork;

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {29, 12, 8, 32, -4},
                {5, 18, 14, 13, 48},
                {17, 27, 11, 26, 18},
                {-6, 22, -3, 41, 26},
                {0, 39, 24, 1, 18}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\n");
        int n, m, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер первого столбца для замены от 0 до 4:  ");
        n = in.nextInt();
        System.out.println("Введите номер второго столбца для замены от 0 до 4:  ");
        m = in.nextInt();
        if (n > array.length && m > array.length) ;
        System.out.println("Введено неверное значение");
        for (int i = 0; i < array.length; i++) {
            temp = array[i][n];
            array[i][n] = array[i][m];
            array[i][m] = temp;
            System.out.println(" Массив с измененным " + n + " столбцом  на " + m + " столбец ." + "\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
    }
}
