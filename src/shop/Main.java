package shop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box c1 = new Box("blue", "Box");
        Tractor b1 = new Tractor("CornTractor", "Tractor");

        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(b1);
        gui.addProduct(new Bus());

        gui.run();
    }
}