// Сформировать двумерный массив размером 30*30. Сложить все числа по диагонали. И вывести результат на экран
package HomeWork;

public class Exercise10 {
    public static void main(String[] args) {
        int[][] array = new int[30][30];
        int sum_d = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 100) + 1);
                if ( i == j)
                sum_d += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print(" Сумма диагонали = " + sum_d + "\t");
    }
}






