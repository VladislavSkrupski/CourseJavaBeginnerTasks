package taskList5.Task4;
    /*
        Задача 4
        Количество баллов: 20
        Дана строка, посчитать в ней отдельно количество запятых, пробелов и точек. Вывести на экран их количество.
    */

public class Task4 {
    public static void main(String[] args) {
        String str = "Дана строка, посчитать в ней отдельно количество запятых, пробелов и точек. Вывести на экран их количество.";
        System.out.println("количество запятых в строке:\t" + str.replaceAll("[^,]", "").length());
        System.out.println("количество пробелов в строке:\t" + str.replaceAll("[^\s]", "").length());
        System.out.println("количество точек в строке:\t\t" + str.replaceAll("[^.]", "").length());
    }
}
