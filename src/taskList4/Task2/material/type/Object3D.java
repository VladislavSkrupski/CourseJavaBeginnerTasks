package taskList4.Task2.material.type;

import taskList4.Task2.material.Material;

public interface Object3D extends Material {
    default double volume(double width, double height, double depth) {
        return width * height * depth / 1000000000;
    }
}
