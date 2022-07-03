package taskList4.Task2.material.type.board;

import taskList4.Task2.material.type.Board;

public abstract class HDF implements Board {
    public static int THICKNESS = 4;
    private String manufacturer;
    private String texture;
    private double boardWidth;
    private double boardHeight;

    protected HDF(String manufacturer, String texture, double boardWidth, double boardHeight) {
        this.manufacturer = manufacturer;
        this.texture = texture;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTexture() {
        return texture;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public abstract double volume(double width, double height);
}
