package taskList6.userClasses;

import java.util.Arrays;

public class UserClass4 {
    char[] chars = new char[]{'a', 'b', 'c', 'd'};

    @Override
    public String toString() {
        return "UserClass4 { " +
                "chars=" + Arrays.toString(chars) +
                " }";
    }
}
