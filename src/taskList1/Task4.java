package taskList1;

public class Task4 {
    /*
        Задача 4
        Количество баллов: 15
        Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
        Пример: дано число 1234, на выходе получить число 4321
     */

    public static void main(String[] args) {
        int a=1234;
        int[] digits=new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i]=a%10;
            a/=10;
        }
        System.out.println(digits[0]*1000+digits[1]*100+digits[2]*10+digits[3]);
    }
}
