package taskList2;

public class Task6 {
    /*
        Задача 6
        Количество баллов: 25
        Дана двумерная матрица. Определить в какой строке матрицы больше всего отрицательных чисел
     */
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{-1,2,3,-4,5},{1,2,-3,4,5},{1,2,-3,-4,5},{1,2,-3,-4,5},{1,2,3,-4,5}};
        int[] counter = new int[5];
        int maxNegative = 0, buffer = 0;
        for (int column = 0; column < matrix.length; column++) {
            for (int row = 0; row < matrix[column].length; row++) {
                if (matrix[column][row] < 0) {
                    counter[row]++;
                }
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (buffer < counter[i]) {
                buffer = counter[i];
                maxNegative = i;
            }
        }
        System.out.println("В " + (maxNegative+1) + "-ой строке больше всего отрицательных чисел");
    }
}
