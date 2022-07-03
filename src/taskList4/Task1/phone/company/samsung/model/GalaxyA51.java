package taskList4.Task1.phone.company.samsung.model;

import taskList4.Task1.phone.company.Samsung;
import taskList4.Task1.voicesupporter.product.Alisa;

public class GalaxyA51 extends Samsung implements Alisa {
    public static final String MODEL = "Galaxy A51";

    @Override
    public void call() {
        System.out.println("Calling from " + COMPANY + " " + MODEL);
    }

    @Override
    public void voice() {
        System.out.println(PRODUCT + " welcomes you!");
    }
}
