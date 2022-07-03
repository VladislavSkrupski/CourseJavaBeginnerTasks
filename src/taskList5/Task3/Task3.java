package taskList5.Task3;

/*
    Задача 3
    Количество баллов: 20
    Дан любой угол. Вывести на экран синус и косинус этого угла.
*/
public class Task3 {
    public static void main(String[] args) {
        double angle = 390.0;
        System.out.printf("%.5f\n", Math.sin(Math.toRadians(angle % 360)));
        System.out.printf("%.5f\n", Math.cos(Math.toRadians(angle % 360)));
    }
}
