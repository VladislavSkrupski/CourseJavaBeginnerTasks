package taskList4.Task1.phone.company.samsung.model;

import taskList4.Task1.phone.company.Samsung;

public class GalaxyA50 extends Samsung {
    public static final String MODEL = "Galaxy A50";

    @Override
    public void call() {
        System.out.println("Calling from " + COMPANY + " " + MODEL);
    }
}
