package com.xwx;

public class Point3D extends Point{
    private int x, y, z;

    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int[] getXYZ(){
        int[] results = new int[3];
        results[0] = this.x;
        results[1] = this.y;
        results[2] = this.z;
        return results;
    }

    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

    public double distance(int x, int y, int z) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        int zDiff = this.z - z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

    @Override
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}