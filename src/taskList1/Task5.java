package taskList1;

public class Task5 {
    /*
        Задача 5
        Количество баллов: 15
        Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
        Пример: дано число 1234, все цифры числа различны.
     */
    public static void main(String[] args) {
        int a = 1234;
        int[] digits=new int[4];
        int buffer = a;
        for (int i = 0; i < 4; i++) {
                digits[i]=buffer%10;
                buffer/=10;
        }
        if (digits[0] != digits[1] && digits[0] != digits[2] && digits[0] != digits[3]) {
            if (digits[1] != digits[2] && digits[1] != digits[3]) {
                if (digits[2] != digits[3]) {
                    System.out.println("Все цифры числа "+a+" различны");
                }
                else System.out.println("В числе "+a+" есть повторяющиеся цифры");
                }
            else System.out.println("В числе "+a+" есть повторяющиеся цифры");
            }
        else System.out.println("В числе "+a+" есть повторяющиеся цифры");
        }
    }

