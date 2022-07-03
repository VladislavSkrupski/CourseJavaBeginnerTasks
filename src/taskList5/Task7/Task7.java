package taskList5.Task7;

/*
    Задача 7
    Количество баллов: 25
    Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
    другой с помощью StringBuilder и метода append,
    а также аналогично для StringBuffer. Сравните и выведите скорость их выполнения.
 */
public class Task7 {
    public static void main(String[] args) {
        int counter = 150000;
        long start;
        long end;
        long deltaStr;
        long deltaStrBld;
        long deltaStrBuf;

        String buf = "a";
        String string = "";
        StringBuilder stringBuilder = new StringBuilder("");
        StringBuffer stringBuffer = new StringBuffer("");

        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            string += buf;
        }
        end = System.currentTimeMillis();
        deltaStr = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringBuilder.append(buf);
        }
        end = System.currentTimeMillis();
        deltaStrBld = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            stringBuffer.append(buf);
        }
        end = System.currentTimeMillis();
        deltaStrBuf = end - start;

        String[][] table = new String[][]{{"String", String.valueOf(deltaStr)}, {"StringBuilder", String.valueOf(deltaStrBld)}, {"StringBuffer", String.valueOf(deltaStrBuf)}};
        String[][] temp = new String[1][1];

        if (Long.parseLong(table[2][1]) < Long.parseLong(table[1][1])) {
            temp[0] = table[2];
            table[2] = table[1];
            table[1] = temp[0];
        }
        if (Long.parseLong(table[1][1]) < Long.parseLong(table[0][1])) {
            temp[0] = table[1];
            table[1] = table[0];
            table[0] = temp[0];
            if (Long.parseLong(table[2][1]) < Long.parseLong(table[1][1])) {
                temp[0] = table[2];
                table[2] = table[1];
                table[1] = temp[0];
            }
        }
        System.out.printf("%-15s\t%-15s\t%-15s\n", "Быстрее", "-------->", "медленнее");
        System.out.printf("%-15s\t%-15s\t%-15s\n", table[0][0], table[1][0], table[2][0]);
        System.out.printf("%-15s\t%-15s\t%-15s\n", table[0][1], table[1][1], table[2][1]);
    }

}
