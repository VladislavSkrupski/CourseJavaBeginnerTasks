package taskList6.userClasses;

public class UserClass1 {
    int a, b;
    String string;

    public UserClass1(int a, int b, String string) {
        this.a = a;
        this.b = b;
        this.string = string;
    }

    @Override
    public String toString() {
        return "UserClass1 { " +
                "a=" + a +
                ", b=" + b +
                ", string='" + string + '\'' +
                " }";
    }
}
