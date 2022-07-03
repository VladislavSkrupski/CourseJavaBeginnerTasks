package taskList1;

public class Task3 {
    /*
        Задача 3
        Количество баллов: 10
        Имеется 645 000 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        А) минут + секунд,
        В) часов + минут + секунд,
        С) дней + часов + минут + секунд,
        D) недель + дней + часов + минут + секунд

     */
    public static void main(String[] args) {
        int seconds=645000;
        int minutes, hours, days, weeks;
        minutes=seconds/60;
        seconds%=60;
        System.out.println(minutes+" минут "+seconds+" секунд");
        hours=minutes/60;
        minutes%=60;
        System.out.println(hours+" часов "+minutes+" минут "+seconds+" секунд");
        days=hours/24;
        hours%=24;
        System.out.println(days+" дней "+hours+" часов "+minutes+" минут "+seconds+" секунд");
        weeks=days/7;
        days%=7;
        System.out.println(weeks+" недель "+days+" дней "+hours+" часов "+minutes+" минут "+seconds+" секунд");
    }
}
