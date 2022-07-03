package taskList1;

public class Task7 {
    /*
      Задача 7
      Количество баллов: 15
      Дано два шестизначных числа. Определить являются ли первые 3 цифры первого числа такими же, как последние 3 цифры последнего числа.
      Пример: даны числа 123456 и 678123, первые 3 цифры первого числа равны последним 3 цифрам второго числа

     */
    public static void main(String[] args) {
        int a = 122456, b = 678221;

//  если последовательность 3-х цифр остаётся неизменной

        //  if ((a/=1000) == (b%=1000)){
        //     System.out.println("Первые 3 цифры первого числа равны последним трём цыфрам второго числа");
        // } else {
        //     System.out.println("Первые 3 цифры первого числа неравны последним трём цыфрам второго числа");
        // }

//  если 3 цифры могут быть в разной последовательности

        int buffer1 = a / 1000, buffer2 = b % 1000;

        int[] digitsBuffer1 = new int[3];
        int[] digitsCounter1 = new int[10];
        for (int i = 0; i < 3; i++) {
            digitsBuffer1[i] = buffer1 % 10;
            buffer1 /= 10;
        }
        for (int i = 0; i < 3; i++) {
            switch (digitsBuffer1[i]) {
                case 0: { digitsCounter1[0]++;break; }
                case 1: { digitsCounter1[1]++;break; }
                case 2: { digitsCounter1[2]++;break; }
                case 3: { digitsCounter1[3]++;break; }
                case 4: { digitsCounter1[4]++;break; }
                case 5: { digitsCounter1[5]++;break; }
                case 6: { digitsCounter1[6]++;break; }
                case 7: { digitsCounter1[7]++;break; }
                case 8: { digitsCounter1[8]++;break; }
                case 9: { digitsCounter1[9]++;break; }
            }
        }
        String sumCounter1="";
        for (int i = 0; i < 10; i++) {
            sumCounter1+=String.valueOf(digitsCounter1[i]);
        }

        int[] digitsBuffer2 = new int[3];
        int[] digitsCounter2 = new int[10];

        //разбиваем buffer2 по цифрам

        for (int i = 0; i < 3; i++) {
            digitsBuffer2[i] = buffer2 % 10;
            buffer2 /= 10;
        }
        for (int i = 0; i < 3; i++) {
            switch (digitsBuffer2[i]) {
                case 0: { digitsCounter2[0]++;break; }
                case 1: { digitsCounter2[1]++;break; }
                case 2: { digitsCounter2[2]++;break; }
                case 3: { digitsCounter2[3]++;break; }
                case 4: { digitsCounter2[4]++;break; }
                case 5: { digitsCounter2[5]++;break; }
                case 6: { digitsCounter2[6]++;break; }
                case 7: { digitsCounter2[7]++;break; }
                case 8: { digitsCounter2[8]++;break; }
                case 9: { digitsCounter2[9]++;break; }
            }
        }
        String sumCounter2="";
        for (int i = 0; i < 10; i++) {
            sumCounter2+=String.valueOf(digitsCounter2[i]);
        }

        if (sumCounter1.equals(sumCounter2)) {
            System.out.println("Первые 3 цифры числа "+a+" равны последним 3-м цыфрам числа "+b);
        } else {
            System.out.println("Первые 3 цифры числа "+a+" неравны последним 3-м цыфрам числа "+b);
        }
    }
}


