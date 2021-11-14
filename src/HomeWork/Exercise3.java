// Сформировать одномерный массив из 55 элементов, заполнить его случайными числами в
// диапазоне от 11 до 14. Вывести все элементы массива, которые являются четными числами на экран
package HomeWork;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = new int[55];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3 + 11);
            if (array[i] % 2 == 0) {
                System.out.println("Значение " + i + " = " + array[i] + ",");
            }
        }
    }
}