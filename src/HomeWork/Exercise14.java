//  Найти положительные элементы главной диагонали квадратной матрицы
package HomeWork;

public class Exercise14 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {29, 12, 8, 32, -4},
                {5, -18, 14, 13, 48},
                {17, 27, 11, 26, 18},
                {-6, 22, -3, -41, 26},
                {0, 39, 24, 1, 18}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nПоложительные числа диагонали : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                System.out.printf("%d, ", array[i][i]);
            }
        }
    }
}
