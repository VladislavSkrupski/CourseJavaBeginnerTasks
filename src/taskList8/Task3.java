package taskList8;

import java.util.Arrays;

public class Task3 {
    /*
        Задача 3
        Количество баллов: 40
        Создать List, содержащий 10 чисел. Отфильтровать их таким образом, чтобы остались только числа меньше 10.
        Затем эти числа перевести в строку. Вывести на экран получившийся список. Реализовать с помощью стримов.
     */
    public static void main(String[] args) {
        Arrays.asList(1, 10, 24, 113, 2, -23, -5, 5, 45, 7).stream().
                filter(x -> x < 10).
                map(x -> String.valueOf(x)).
                forEach(x -> System.out.print(x + " "));
    }
}
