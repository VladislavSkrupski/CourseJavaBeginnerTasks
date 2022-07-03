package taskList1;

public class Task6 {
    /*
     Задача 6
     Количество баллов: 15
     Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра двойкой. Определите, является ли число четным.
     Пример: дано число 124, оно трехзначное, последняя цифра не является двойкой, число чётное

    */
    public static void main(String[] args) {
        int a = 124;
        boolean even = (a % 2 == 0);
        String strA = String.valueOf(a);
        int[] digits = new int[strA.length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = a % 10;
            a /= 10;
        }
        if (digits.length == 3) {
            System.out.print("Число " + strA + " трёхзначное, ");
        } else {
            System.out.print("Число " + strA + " не трёхзначное, ");
        }
        if (digits[0] == 2) {
            System.out.print("последняя цифра является двойкой, ");
        } else {
            System.out.print("последняя цифра не является двойкой, ");
        }
        if (even) {
            System.out.println("число чётное");
        } else {
            System.out.println("число нечётное");
        }
    }
}
