package taskList4.Task2.material.type;

import taskList4.Task2.material.Material;
import taskList4.Task2.material.Operations;

public interface Board extends Material, Operations {
    double square(double width, double height);
}
