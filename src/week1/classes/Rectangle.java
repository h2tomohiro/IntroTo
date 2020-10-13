package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        this.color = "Blue";
    }

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (Character.isUpperCase(color.charAt(0)) == true && color.length() > 2 && color.length() < 20){
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }

    public void draw(){
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(color.charAt(0));
            }
            System.out.println();
        }
    }
}