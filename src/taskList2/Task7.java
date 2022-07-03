package taskList2;

public class Task7 {
    /*
        Задача 7
        Количество баллов: 25
        Создать и вывести нерегулярный двумерный массив в виде треугольника
     */
    public static void main(String[] args) {
        int a=10;
        int[][] array = new int[a][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i+1];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
