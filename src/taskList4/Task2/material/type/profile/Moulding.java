package taskList4.Task2.material.type.profile;

import taskList4.Task2.material.type.Profile;

public abstract class Moulding implements Profile {
    private String texture;
    private double length;

    public Moulding(String texture, double length) {
        this.texture = texture;
        this.length = length;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
