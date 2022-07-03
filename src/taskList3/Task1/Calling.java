package taskList3.Task1;

public class Calling {
    public static void main(String[] args) {
        String name1 ="Вася", name2 = "Коля";
        Phone phone1 = new Phone("MI","T10");
        Phone phone2 = new Phone(334585, "Apple","11 Pro");
        phone1.contactCall(name1);
        phone2.contactCall(name2);
        phone1.setNumber(4522222);
        phone1.contactCall(name1);
    }
}
