package Kamera;

public class Kamera {
    private String color;
    private float weight;
    private int pixel;

    // Constructor

    public Kamera(String color, float weight, int pixel) {
        this.color = color;
        this.weight = weight;
        this.pixel = pixel;
    }


    // Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}