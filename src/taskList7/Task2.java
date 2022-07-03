package taskList7;

public class Task2 {
    /*
        Задача 2
        Количество баллов: 15
        Дана строка. Генерировать исключение IllegalArgumentException, если длина строки больше 5.
     */
    public static void main(String[] args) {
        String str = "123456";
        try {
            if (str.length() > 5)
                throw new IllegalArgumentException("String length more then 5");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.fillInStackTrace());
        }
    }
}
