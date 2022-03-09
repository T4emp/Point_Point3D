package com.xwx;

public class Point3D extends Point{
    private int z;

    public Point3D (int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    public Point3D(){
        this.z = 0;
    }

    public Point3D(int z){
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int[] getXYZ() {
        int[] results = new int[3];
        results[0] = super.getX();
        results[1] = super.getY();
        results[2] = this.z;
        return results;
    }

    public void setXYZ(int x, int y, int z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    @Override
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

    public double distance(int x, int y, int z) {
        int xDiff = super.getX() - x;
        int yDiff = super.getY() - y;
        int zDiff = this.z - z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

    @Override
    public double distance() {
        return Math.sqrt(super.getX() * super.getX() + super.getY() * super.getY() + this.z * this.z);
    }
}