package taskList7;

import taskList7.Exceptions.NegativeIntException;
import taskList7.Exceptions.PositiveIntException;
import taskList7.Exceptions.ZeroIntException;

public class Task4 {
    /*
        Задача 4
        Количество баллов: 25
        Создать 3 собственных исключения, создать обработчик для каждого исключения, реализовать finally блок.
     */
    public static void main(String[] args) {
        int a = 2;
        try {
            intRecognition(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Программа завершена");
        }
    }

    public static void intRecognition(int a) throws NegativeIntException, PositiveIntException, ZeroIntException {
        if (a == 0) throw new ZeroIntException("a = 0");
        else if (a < 0) throw new NegativeIntException("a < 0");
        else throw new PositiveIntException("a > 0");
    }
}

