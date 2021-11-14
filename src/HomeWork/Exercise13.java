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
            for (int j = 0; j < array.length; j++) {
                var tmp = array[i][array.length-5];
                array[i][array.length-5] = array[i][array.length-1];
                array[i][array.length-1] = tmp;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}