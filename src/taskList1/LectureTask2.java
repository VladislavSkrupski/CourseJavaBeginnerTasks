package taskList1;

public class LectureTask2 {
    /*
        Задача 2
        Сделать через switch/case. По номеру месяца, метод должен определить время года. Зима - 12, 1, 2 месяцы; Весна - 3, 4, 5; Лето - 6, 7, 8; Осень - 9, 10, 11.
        Пример:  2 - зима. 5 - весна
    */
    public static void main(String[] args) {
        byte month = 9;
        switch (month) {
            case 12:
            case 1:
            case 2: { System.out.println("Зима"); break; }
            case 3:
            case 4:
            case 5: { System.out.println("Весна"); break; }
            case 6:
            case 7:
            case 8: { System.out.println("Лето"); break; }
            case 9:
            case 10:
            case 11: { System.out.println("Осень"); break; }
        }
    }
}
