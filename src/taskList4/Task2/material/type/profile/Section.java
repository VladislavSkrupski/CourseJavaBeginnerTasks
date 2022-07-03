package taskList4.Task2.material.type.profile;

public class Section {

    private double width;
    private double height;

    public Section() {
    }

    public Section(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double sectionSquare(double width, double height) {
        return width * height;
    }

}
