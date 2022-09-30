package com.csc205.project2;

import java.util.Vector;

public class Project2 {

    public Project2(int length) {
    }

    public Project2() {

    }

    public static void main(String[] args) {

        Sphere sphere = new Sphere(2.0);
        System.out.println(sphere);

        Cylinder cylinder = new Cylinder(1.0);
        System.out.println(cylinder);


      Cube cube = new Cube (5.0 );
        System.out.println(cube);

        Cuboid cuboid = new Cuboid(1.0);
        System.out.println(cuboid);
    }



}


