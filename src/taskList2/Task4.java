package taskList2;

public class Task4 {
    /*
        Задача 4
        Количество баллов: 15
        Вывести таблицу умножения в обратном порядке
        Пример: 81 72 63 ...
	            72 64 56 ...
                63 56 49 ...
     */
    public static void main(String[] args) {
        int[][] table = new int[9][9];
        for (int i = table.length-1; i >= 0; i--) {
            for (int j = table[i].length-1; j >= 0; j--) {
                table[i][j]=(i+1)*(j+1);
                System.out.print(table[i][j] + "\t");
                }
            System.out.println();
        }
    }
}
