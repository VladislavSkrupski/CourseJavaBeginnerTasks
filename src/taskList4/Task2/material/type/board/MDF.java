package taskList4.Task2.material.type.board;

import taskList4.Task2.material.type.Board;

public abstract class MDF implements Board {
    private String manufacturer;
    private boolean laminate;
    private double thickness;
    private double boardWidth;
    private double boardHeight;


    protected MDF(String manufacturer, boolean laminate, double thickness, double boardWidth, double boardHeight) {
        this.manufacturer = manufacturer;
        this.thickness = thickness;
        this.laminate = laminate;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isLaminate() {
        return laminate;
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
