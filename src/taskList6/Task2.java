package taskList6;

import java.util.*;

public class Task2 {
    /*
        Задача 2
        Количество баллов: 15
        Создать List, содержащий 5 строк. Пройтись по всем строкам и добавить к этим строкам инверсию имеющейся строки.
        Пример: [“ab”, “cd”, “fvt”...] - [“abba”, “cddc”, “fvttvf”...]
    */
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("ad", "cde", "123", "fgtrf", "pos");
        System.out.print(stringList + " - ");
        for (int i = 0; i < stringList.size(); i++) {
            stringList.set(i, stringList.get(i).concat(String.valueOf(new StringBuffer(stringList.get(i)).reverse())));
        }
        System.out.println(stringList);
    }
}
