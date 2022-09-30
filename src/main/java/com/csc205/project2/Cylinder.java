package com.csc205.project2;

public class Cylinder {

    public double radius;

    public Cylinder() {
        super();
        this.radius = 0.0;
    }

    public Cylinder(double v) {
        super();
        this.radius = v;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return ((2.0 * Math.PI * radius  * 4) +  (2 * Math.PI * Math.pow(radius, 2)));
    }

    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double height(){
        return 4.0;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height());
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}