package taskList7;

import taskList7.Exceptions.ListThreeElementsException;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    /*
        Задача 3
        Количество баллов: 20
        Создать собственное исключение и “выкидывать” его при условии, что Список содержит 3 элемента
     */
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("a", "b", "c");
        if (arrayList.size() == 3) try {
            throw new ListThreeElementsException("List contains 3 elements");
        } catch (ListThreeElementsException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
