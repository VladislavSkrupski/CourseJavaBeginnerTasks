package taskList6.userClasses;

import java.util.Arrays;

public class UserClass2 {
    private double x = 0;
    private double y = 0;

    public UserClass2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public String toString() {
        return "UserClass2 { " +
                "x=" + x +
                ", y=" + y +
                " Methods: " + (Arrays.toString(UserClass2.class.getDeclaredMethods())) + " }";
    }
}
