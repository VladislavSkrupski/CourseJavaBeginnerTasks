package taskList6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    /*
        Задача 4
        Количество баллов: 15
        Создать словарь на основе Map, принимающий на вход английское слово и выводящее русский перевод. Достаточно 1-3 слов. Продемонстрировать работу
    */
    public static void main(String[] args) {
        String engWord;
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dictionary", "словарь");
        dictionary.put("word", "слово");
        dictionary.put("root", "корень");

        System.out.print("Введите английское слово:\nДоступные: ");
        dictionary.forEach((k, v) -> System.out.print(k + "\t"));
        System.out.println();

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                engWord = scanner.nextLine();
                if (dictionary.containsKey(engWord))
                    break;
                else throw new Exception();
            } catch (Exception e) {
                System.out.println("Введите другое слово");
            }
        } while (true);

        System.out.println("Перевод на русский: ");
        System.out.println(dictionary.get(engWord));
    }
}
