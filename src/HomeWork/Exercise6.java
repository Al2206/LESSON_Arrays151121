//Сформировать одномерный массив из n элементов, заполнить его случайными числами
// в диапазоне от 11 до 100. Вывести последний элемент на экран.
package HomeWork;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n:  ");
        n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 89) + 11);
            int last = array[array.length - 1];
            System.out.print(array[i] + "\t");//для проверки
        }
        System.out.println();
    }
}
