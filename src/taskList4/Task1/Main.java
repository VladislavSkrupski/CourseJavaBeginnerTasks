package taskList4.Task1;

import taskList4.Task1.phone.Phone;
import taskList4.Task1.phone.company.apple.model.Iphone11;
import taskList4.Task1.phone.company.apple.model.Iphone12;
import taskList4.Task1.phone.company.samsung.model.GalaxyA50;
import taskList4.Task1.phone.company.samsung.model.GalaxyA51;;

public class Main {
    public static void main(String[] args) {
        Phone a50 = new GalaxyA50();
        Phone a51 = new GalaxyA51();
        Phone i11 = new Iphone11();
        Iphone12 i12 = new Iphone12();
        a50.call();
        a51.call();
        ((GalaxyA51) a51).voice();
        i11.call();
        ((Iphone11) i11).Supporter();
        i12.call();
        i12.voice();
        i12.Supporter();
    }
}

