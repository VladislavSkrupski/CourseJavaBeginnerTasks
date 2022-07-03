package taskList1;

public class Task1 {
   /*
    Задача 1
    Количество баллов: 5
    Дано число от 0 до 59 включительно. Определить в какую четверть часа это число попадает
    Пример: дано число 15, попадает во вторую четверть часа.
   */
    public static void main(String[] args) {
        byte minute = 55;
        if (minute >= 0 && minute <= 59)
            System.out.println((minute / 15 + 1) + "-ая четверть часа");
        else System.out.println("введите число от 0 до 59");
    }
}
