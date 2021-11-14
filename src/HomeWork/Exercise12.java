//12) Сформировать двумерный массив размером 10*10. Сложить все элементы четных строк
package HomeWork;

public class Exercise12 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            for (int j = 1; j < array.length; j +=2) {
                array[i][j] = (int) ((Math.random() * 100) + 1);
                if ( i % 2 == 0 ){
                }
                sum += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print(" Сумма  = " + sum + "\t");
    }
}
