package com.xwx;

public class TestPoint3D {
    public static void test(){
        Point3D p1 = new Point3D();
        System.out.println(p1);
        Point3D p2 = new Point3D(6, 7, 3);
        System.out.println(p2);

        p1.setXYZ(9, 8, 2);
        System.out.println("X = " + p1.getXYZ()[0]);
        System.out.println("Y = " + p1.getXYZ()[1]);
        System.out.println("Z = " + p1.getXYZ()[2]);

        p2.setXYZ(14, 5, 11);
        System.out.printf("Расстояние: %.2f%n", p2.distance());
        System.out.printf("Расстояние: %.2f%n", p1.distance(10, 5, 17));
    }
}