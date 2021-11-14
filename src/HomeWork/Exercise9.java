//Сформировать двумерный массив размером 10*10. Вывести каждый нечетный столбец на экран
package HomeWork;

public class Exercise9 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length; j +=2) {
                array[i][j] = (int) ((Math.random() * 100) + 1);
                if ( i % 2 == 0 ){
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
