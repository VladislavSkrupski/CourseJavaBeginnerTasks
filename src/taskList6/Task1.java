package taskList6;

import java.util.ArrayList;

public class Task1 {
    /*
        Задача 1
        Количество баллов: 10
        Создать List, содержащий 100 рандомных целых чисел от 0 до 1000
    */
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) Math.round(Math.random() * 1000));
        }
        for (int a : randomList) {
            System.out.print(a + " ");
        }
    }
}
