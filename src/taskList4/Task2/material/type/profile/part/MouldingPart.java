package taskList4.Task2.material.type.profile.part;

import taskList4.Task2.material.type.profile.Moulding;

public class MouldingPart extends Moulding {

    public MouldingPart(String texture, double length) {
        super(texture, length);
    }

    @Override
    public boolean hasTexture(String texture) {
        if (texture.equals("")) return false;
        else return true;

    }

    @Override
    public double volume(double sectionSquare, double length) {

        return sectionSquare * length / 1000000000;
    }
}
