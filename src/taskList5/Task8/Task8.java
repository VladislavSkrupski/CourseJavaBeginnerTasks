package taskList5.Task8;

/*
    Задача 8
    Количество баллов: 15
    Дано число примитивного типа int. Перевести это число в строку и вывести на экран каждый символ этой строки.
 */
public class Task8 {
    public static void main(String[] args) {
        int i = 100;
        String str = String.valueOf(i);
        for (char a : str.toCharArray()) {
            System.out.print(a);
        }
    }
}
