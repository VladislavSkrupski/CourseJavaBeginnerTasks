package taskList4.Task1.phone.company.apple.model;

import taskList4.Task1.phone.company.Apple;

public class Iphone11 extends Apple {
    public static final String MODEL = "Iphone 11";

    @Override
    public void Supporter() {
        System.out.println("Hello, can I help you?");
    }

    @Override
    public void call() {
        System.out.println("Calling from " + COMPANY + " " + MODEL);
    }
}
