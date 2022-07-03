package taskList2;

public class Task1 {
    /*
        Задача 1
        Количество баллов: 10
        Создать массив из 5 чисел. Вывести среднее арифметическое число
        Пример: Дано: массив [1, 2, 3, 4, 5]. Среднее арифметическое - 3.
    */
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        float mid = 0;
        for (int i = 0; i < array.length; i++) {
            mid += array[i];
        }
        mid = (float) mid / array.length;
        System.out.println("Среднее арифметическое - " + mid);
    }
}
