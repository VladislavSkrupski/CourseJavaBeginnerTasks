package taskList8;

import java.util.function.*;

public class Task1 {
    /*
        Задача 1
        Количество баллов: 20
        Реализовать любые 5 встроенных функциональных интерфейсов с помощью лямбд, которые появились в Java 8
     */
    public static void main(String[] args) {
        Predicate<Integer> isNegative = value -> value < 0;
        System.out.println("Predicate: " + isNegative.test(-5));

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("BinaryOperator: " + sum.apply(4, 5));

        UnaryOperator<Integer> pow3 = x -> (int) Math.pow(x, 3);
        System.out.println("UnaryOperator: " + pow3.apply(3));

//        Function<StringBuffer,StringBuffer> reverse = StringBuffer::reverse;
        Function<StringBuffer, StringBuffer> reverse = strBuf -> strBuf.reverse();
        System.out.println("Function: " + reverse.apply(new StringBuffer("abcde")));

        Consumer<String> sout = str -> System.out.println(str);
        System.out.print("Consumer: ");
        sout.accept("qwerty");

    }
}
