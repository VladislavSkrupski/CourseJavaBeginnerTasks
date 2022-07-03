package taskList5.Task6;

/*
    Задача 6
    Количество баллов: 30
    Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
*/
public class Task6 {
    public static void main(String[] args) {
        String str = " \fИмеется  строка с  текстом.Вывести   текст,\t\tсоставленный из последних букв всех слов.\n";
        str = str.replaceAll("^\\s+|\\s+$", "");
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9-'&]", " ");
        str = str.replaceAll("\s{2,}", " ");
        String[] buf = str.split(" ");
        StringBuilder text = new StringBuilder();
        for (String last : buf) {
            text.append(last.charAt(last.length() - 1));
        }
        System.out.println(text);
    }
}
