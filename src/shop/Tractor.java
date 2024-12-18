package shop;

public class Tractor implements Product {
    private String style;
    private String name;

    public Tractor(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String getName() {
        return name;
    }

}