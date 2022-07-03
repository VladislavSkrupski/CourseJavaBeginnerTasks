package taskList5.Task2;
    /*
        Задача 2
        Количество баллов: 15
        Вывести на экран в цикле 5 случайных чисел от 0 до 32.
    */

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.round(Math.random()*32));
        }
    }
}
