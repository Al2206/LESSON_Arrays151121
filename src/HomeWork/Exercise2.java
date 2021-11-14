//2) Сформировать одномерный массив из 55 элементов, заполнить его случайными
// числами в диапазоне от 11 до 959. Вывести все элементы массива с четными номерами на экран
package HomeWork;

public class Exercise2 {
    public static void main(String[] args) {
        int[] array = new int[55];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 948 + 11);
            if (array[i] % 2 == 0) {
                System.out.println("Значение " + i + " = " + array[i] + ",");
            }
        }
    }
}