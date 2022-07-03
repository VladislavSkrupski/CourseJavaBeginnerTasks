package taskList7;

public class Task1 {
    /*
        Задача 1
        Количество баллов: 10
        Создать код, который будет перехватывать и обрабатывать любое конкретное исключение (без использования throw new) (например, NullPointerException)
     */
    public static void main(String[] args) {
        String str  = null;
        try {
            str.equals("str");
        } catch (NullPointerException e){
            System.out.println(e.fillInStackTrace());
        }
    }
}
