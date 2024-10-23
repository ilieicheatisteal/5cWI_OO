package Kamera;

import java.util.ArrayList;
import java.util.List;

public class SD {
    private int capacity;
    private List<Picture> pictures = new ArrayList<Picture>();
    private int storage;
    private int warningAmount;

    public SD(int capacity, int warningAmount) {
        this.capacity = capacity;
        this.warningAmount = warningAmount;
        storage = this.capacity;
    }

    public void SavePicture(Picture pic) {
        if (storage - pic.getSize() <= 0) {
            Full();
            return;
        } else if (storage - pic.getSize() <= warningAmount) {
            Warning();
        }
        pictures.add(pic);
        storage -= pic.getSize();
    }

    public List<Picture> GetAllFiles() {
        return pictures;
    }

    private void Warning() {
        System.out.println("Warning: the storage is nearly full!");
    }

    private void Full() {
        System.out.println("Storage is Full, Picture could not be saved!");
    }
}