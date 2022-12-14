package com.csc205.project2;

public class Cube{

    public double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }



    public double surfaceArea() {

       return 6 * width * width;
    }



    public double width() {
        return (4 * 1) + 1;
    }

    public double volume() {
        return width* width* width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}

