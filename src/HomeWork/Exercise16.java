// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
package HomeWork;

public class Exercise16 {
    public static void main(String[] args) {
        int[][] ar = new int[10][10];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = (int) ((Math.random() * 100) + 1);
                System.out.println(ar[i][j] + "\t");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for (int [] array : ar) {
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] % 2 != 0) {
                    ar[i][j] = max;
                }
            }
        }
        for (int[] array : ar) {
            for (int element : array) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
//на печать первую матрицу выводит коряво...