package taskList2;

public class Task3 {
    /*
        Задача 3
        Количество баллов: 10
        Создать пустой массив на N чисел. Заполнить этот массив чётными числами и вывести на экран
        Пример: Дано: N = 5. Вывод на экран - 2, 4, 6, 8, 10
     */
    public static void main(String[] args) {
        int N = 5;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i]+=(i+1)*2;
            System.out.print(array[i]);
            if ((i+1) < N) {
                System.out.print(", ");
            }
        }
    }
}
