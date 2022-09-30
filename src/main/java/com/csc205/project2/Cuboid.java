package com.csc205.project2;

public class Cuboid {

    public double length;

    public Cuboid() {
        super();
        this.length= 0.0;
    }

    public Cuboid(double v) {
        super();
        this.length = v;
    }

    public double width() {
        return 5;
    }
    public double height() {
        return 4;
    }



    public double surfaceArea() {

        double width = 5;
        double height = 4;
        return 2*(length*width + height*width + height*height );
    }

    public double volume() {
       double height = 4;
        double width = 5;
        return width * height * length;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuboid {");
        sb.append("length=").append(length);
        sb.append(", width=").append(surfaceArea());
        sb.append(", height=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
