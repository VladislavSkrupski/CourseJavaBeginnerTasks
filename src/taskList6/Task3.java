package taskList6;

import taskList6.userClasses.*;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    /*
        Задача 3
        Количество баллов: 15
        Создать List, содержащий 5 пользовательских (не Java) объектов. Вывести на экран в читаемом виде все объекты из списка
     */
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add(new UserClass1(1, 10, "A"));
        objectList.add(new UserClass2(1, 10));
        objectList.add(new UserClass3());
        objectList.add(new UserClass4());
        objectList.add(new UserClass5(false));

        objectList.forEach((object) -> System.out.println(object.toString()));
    }
}