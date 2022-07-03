package taskList4.Task2.material.type.board.panel;

import taskList4.Task2.material.type.board.MDF;

public class MDFPanel extends MDF {
    private double width, height;

    public MDFPanel(String manufacturer, boolean laminate, double thickness, double boardWidth, double boardHeight) {
        super(manufacturer, laminate, thickness, boardWidth, boardHeight);
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

    @Override
    public boolean hasTexture(String texture) {
        if (texture.equals("")) return false;
        else return true;
    }

    @Override
    public void milling(double length, double depth) {
        System.out.println("Milling " + length + " mm with depth " + depth);
    }

    @Override
    public void cutting(double length) {
        System.out.println("Cutting length = " + length);
    }

    @Override
    public void drilling(double x, double y, double z, double diameter) {
        System.out.println("Drilling at point x = " + x + " y = " + y + " with depth " + z + " and diameter" + diameter);
    }

    @Override
    public void edging() {
        System.out.println("Edging");
    }

    @Override
    public double square(double width, double height) {
        return width * height;
    }

    public double volume(double width, double height, double thickness) {
        return width * height * thickness / 1000000000;
    }

    ;
}
