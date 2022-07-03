package taskList2;

public class Task5 {
    /*
        Задача 5
        Количество баллов: 15
        Дано три целочисленных массива произвольной длины. Определить, в каком массиве сумма всех чисел больше и вывести максимальную сумму на экран
        Пример: Дано: 1 массив - [1, 2, 3], 2 массив - [2, 3], 3 массив - [0, 0, 5]. На экран выведется 6
     */
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 3 };
        int[] array2 = new int[] { 2, 3 };
        int[] array3 = new int[] { 0, 0, 5 };
        int buffer = 0, max = 0;
        for (int i = 0; i < array1.length; i++) {
            max += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            buffer += array2[i];
        }
        if ( max >= buffer ) {
            buffer = 0;
        } else {
            max = buffer;
            buffer = 0;
        }
        for (int i = 0; i < array3.length; i++) {
            buffer += array3[i];
        }
        if (max >= buffer)
            System.out.println(max);
        else
            System.out.println(buffer);
//===============================================================================================

//        int[][] table = new int[][] {{1, 2, 3},{2, 3},{0, 0, 5}};
//        int[] sum = new int[3];
//
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[i].length; j++) {
//                sum[i]+=table[i][j];
//            }
//        }
//        if (sum[0] >= sum[1] && sum[0] >= sum[2])
//            System.out.println(sum[0]);
//        else if (sum[1]>=sum[2])
//            System.out.println(sum[1]);
//        else
//            System.out.println(sum[2]);
    }
}
