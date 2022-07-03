package taskList8;

public class Task2 {
    /*
        Задача 2
        Количество баллов: 40
        Создать собственный функциональный интерфейс, принимающий три параметра. Реализовать его с помощью лямбд.
     */
    public static void main(String[] args) {
        TripleMultiply<Integer, Integer, Integer> tripleMultiply = (x, y, z) -> x * y * z;
        System.out.println("TripleMultiply<X,Y,Z>: " + tripleMultiply.multiply(2, 3, 5));
    }
}
