//Сформировать двумерный массив размером 10*10. Вывести на экран все
// элементы выше побочной диагонали.
package HomeWork;
public class Exercise11 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 100) + 1);
                if (i == j);

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
