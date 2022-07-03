package taskList4.Task2.material.type.body3D.product;

import taskList4.Task2.material.type.body3D.Block;

public class Product extends Block {

    public Product(String texture, double width, double height, double depth) {
        super(texture, width, height, depth);
    }

    @Override
    public void moulding() {
        System.out.println("Form accepted");
    }

    @Override
    public boolean hasTexture(String texture) {
        if (texture.equals("")) return false;
        else return true;
    }
}
