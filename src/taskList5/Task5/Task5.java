package taskList5.Task5;

/*
    Задача 5
    Количество баллов: 30
    Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть,
    что слова могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
    но могут и отсутствовать.
 */

public class Task5 {
    public static void main(String[] args) {
        String str = "  \rИмеется строка c  текстом.\nПодсчитать  количество\t слов в тексте.  ";
        str = str.replaceAll("^\\s+|\\s+$", "");              //убираем начальные и конечные пробельные символы
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9-'&]", " ");   //оставляем только буквы, цифры, дефис, апостроф и амперсанд
        str = str.replaceAll("\s{2,}", " ");                  //заменяем многопробельные разделения на одиночные
        String[] buf = str.split(" ");
        System.out.println("Количество слов в тексте = " + buf.length);
    }
}
