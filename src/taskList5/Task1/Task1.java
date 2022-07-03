package taskList5.Task1;
    /*
        Задача 1
        Количество баллов: 10
        Реализовать подсчет количества созданных машин (из прошлого задания) с помощью статической переменной.
    */

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        System.out.println(Car.getCarAmount());
    }
}

class Car {
    private static int carAmount;

    public Car() {
        ++carAmount;
    }

    public static int getCarAmount() {
        return carAmount;
    }
}
