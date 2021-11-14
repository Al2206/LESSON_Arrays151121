//5) Сформировать одномерный массив из 100 элементов, заполнить его
// случайными числами в диапазоне от 11 до 959. Вывести на экран максимальный и минимальный элемент.
package HomeWork;

import java.util.Arrays;
public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int min = 959;
        int max = 11;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 959) + 11);
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("MIN = " + min + "\t" + "MAX = " + max);
    }
}


