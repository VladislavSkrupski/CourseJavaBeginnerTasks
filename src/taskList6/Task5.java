package taskList6;

import taskList6.userClasses.RusTranslation;

import java.util.*;

public class Task5 {
    /*
        Задача 5
        Количество баллов: 20
        Создать словарь на основе Map, принимающий на вход английское слово и выводящее русский перевод этого слова + синонимы.
        Достаточно 1-3 слов. Продемонстрировать работу.
    */
    public static void main(String[] args) {
        String readEngWord;
        RusTranslation word1 = new RusTranslation("particle", "частица", Arrays.asList("grain, fragment"));
        RusTranslation word2 = new RusTranslation("article", "статья", Arrays.asList("paragraph", "essay", "story"));
        RusTranslation word3 = new RusTranslation("part", "часть", Arrays.asList("element", "piece"));

        Map<String, RusTranslation> dictionary = new HashMap<>();
        dictionary.put(word1.getEngWord(), word1);
        dictionary.put(word2.getEngWord(), word2);
        dictionary.put(word3.getEngWord(), word3);

        System.out.print("Введите английское слово:\nДоступные: ");
        dictionary.forEach((k, v) -> System.out.print(k + " "));
        System.out.println();

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                readEngWord = scanner.nextLine();
                if (dictionary.containsKey(readEngWord))
                    break;
                else throw new Exception();
            } catch (Exception e) {
                System.out.println("Введите другое слово");
            }
        } while (true);

        System.out.println(dictionary.get(readEngWord).toString());
    }
}
