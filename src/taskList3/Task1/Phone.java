package taskList3.Task1;

public class Phone {
    private int number;
    private String mark;
    private String model;

    public Phone(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Phone(int number, String mark, String model) {
        this.number = number;
        this.mark = mark;
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   public void contactCall (String name) {
        if (number != 0) {
            System.out.println("Звонит " + name);
        } else {
            System.out.println("Ошибка");
        }
   }
}
