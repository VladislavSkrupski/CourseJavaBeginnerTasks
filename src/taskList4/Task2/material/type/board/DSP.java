package taskList4.Task2.material.type.board;

import taskList4.Task2.material.type.Board;

public abstract class DSP implements Board {
    private String manufacturer;
    private String texture;
    private double thickness;
    private double boardWidth;
    private double boardHeight;

    protected DSP(String manufacturer, String texture, double thickness, double boardWidth, double boardHeight) {
        this.manufacturer = manufacturer;
        this.texture = texture;
        this.thickness = thickness;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getTexture() {
        return texture;
    }

    public double getThickness() {
        return thickness;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }
}
