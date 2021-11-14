// Сформировать одномерный массив из 20 элементов,
// заполнить его случайными числами в диапазоне от 11 до 959.
// Вывести все элементы массива на экран
package HomeWork;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i]=(int) (Math.random()* 948+11);
            System.out.println("Значение " +i + " = " + array[i] + ",");
        }
    }
}
