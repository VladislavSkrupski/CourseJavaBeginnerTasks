package taskList4.Task2.material.type.body3D;

import taskList4.Task2.material.type.Object3D;

public abstract class Block implements Object3D {
    private String texture;
    private double width;
    private double height;
    private double depth;

    protected Block(String texture, double width, double height, double depth) {
        this.texture = texture;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getTexture() {
        return texture;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public abstract void moulding();
}
