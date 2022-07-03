package taskList6.userClasses;

import java.util.Arrays;

public class UserClass5 {
    boolean isTrue;

    public UserClass5() {
    }

    public UserClass5(boolean isTrue) {
        this.isTrue = isTrue;
    }

    @Override
    public String toString() {
        return "UserClass5 { " +
                "isTrue=" + isTrue +
                " Constructors: " +
                Arrays.toString(UserClass5.class.getConstructors()) + " }";
    }
}
