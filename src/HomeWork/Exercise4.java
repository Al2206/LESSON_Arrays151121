//Сформировать одномерный массив из 30 элементов, заполнить его случайными числами в диапазоне от 1 до 30.
// Сложить каждый третий элемент в массиве, и присвоить сумму в переменную result. Вывести result на экран
package HomeWork;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[30];
        int result = 0;
        for (int i = 0; i < array.length; i+=3) {
            array[i] = (int) ((Math.random() * 29 + 1));
            System.out.println("Значение " + i + " = " + array[i] + ",");
            System.out.println(result += array[i]);
        }
    }
}