package taskList4.Task2;

import taskList4.Task2.material.type.board.panel.DSPPanel;
import taskList4.Task2.material.type.board.panel.HDFPanel;
import taskList4.Task2.material.type.board.panel.MDFPanel;
import taskList4.Task2.material.type.body3D.product.Product;
import taskList4.Task2.material.type.profile.Section;
import taskList4.Task2.material.type.profile.part.MouldingPart;

public class Main {
    public static void main(String[] args) {
        DSPPanel dspPanel = new DSPPanel("SwissKrono", "D2850", 18, 2800, 2070);
        MDFPanel mdfPanel = new MDFPanel("Kastamonu", true, 19.5, 3050, 1320);
        HDFPanel hdfPanel = new HDFPanel("Egger", "W908 ST2", 2500, 2070);
        Product product = new Product("wood", 100, 100, 100);
        MouldingPart profile = new MouldingPart("Aluminium handle", 1200);
        dspPanel.setWidth(1300);
        dspPanel.setHeight(600);
        mdfPanel.setWidth(2400.5);
        mdfPanel.setHeight(2300);
        hdfPanel.setWidth(2000);
        hdfPanel.setHeight(2000);
        System.out.println("Material DSP " + dspPanel.getManufacturer() + " " + dspPanel.getTexture() + " - " + "panel " + dspPanel.getWidth() + "x" + dspPanel.getHeight() + " has volume " + dspPanel.volume(dspPanel.getWidth(), dspPanel.getHeight(), dspPanel.getThickness()) + " m^3");
        System.out.println("Material MDF " + mdfPanel.getManufacturer() + " " + (mdfPanel.isLaminate() ? "laminated" : "") + " - " + "panel " + mdfPanel.getWidth() + "x" + mdfPanel.getHeight() + " has volume " + mdfPanel.volume(mdfPanel.getWidth(), mdfPanel.getHeight(), mdfPanel.getThickness()) + " m^3");
        System.out.println("Material HDF " + hdfPanel.getManufacturer() + " " + hdfPanel.getTexture() + " - " + "panel " + hdfPanel.getWidth() + "x" + hdfPanel.getHeight() + " has volume " + hdfPanel.volume(hdfPanel.getWidth(), hdfPanel.getHeight()) + " m^3");
        System.out.println("3D-object made from "+product.getTexture() + " and has volume "+ product.volume(product.getWidth(), product.getHeight(), product.getDepth())+" m^3");
        System.out.println(profile.getTexture()+" has volume "+profile.volume(Section.sectionSquare(100, 150), profile.getLength())+"m^3");

    }
}
