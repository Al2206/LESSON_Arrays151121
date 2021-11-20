//Сформировать двумерный массив размером 10*10. Вывести на экран все
// элементы выше побочной диагонали.
package HomeWork;
public class Exercise11 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) ((Math.random() * 100) + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j >= array.length) array[i][j] = 0;
                {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
// Хотел, что бы вместо " 0 " вообще ни чего не печатало... Не получилось..
