package taskList4.Task1.phone.company.apple.model;

import taskList4.Task1.phone.company.Apple;
import taskList4.Task1.voicesupporter.product.Siri;

public class Iphone12 extends Apple implements Siri {
    public static final String MODEL = "Iphone 12";

    @Override
    public void call() {
        System.out.println("Calling from " + COMPANY + " " + MODEL);
    }

    @Override
    public void Supporter() {
        System.out.println("Hello, can I help you?");
    }

    @Override
    public void voice() {
        System.out.println(PRODUCT + " welcomes you!");
    }
}
