package taskList2;

public class Task2 {
    /*
        Задача 2
        Количество баллов: 10
        Дано число N. Вывести сумму всех чисел от единицы до N включительно
        Пример: Дано: N = 10. Сумма от одного до десяти включительно - 55
     */
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        for (int i = 1; i <= N ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
