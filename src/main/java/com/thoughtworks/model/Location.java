package com.thoughtworks.model;

/**
 * Created by peter on 2016/9/20 0020.
 */
public class Location{
    private int x;
    private int y;
    public Location(int x,int y){
        this.x=x;
        this.y=y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (x != location.x) return false;
        return y == location.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return x+" "+y;
    }

//    @Override
//    protected Location clone() throws CloneNotSupportedException {
//        Location location = (Location)super.clone();
//        location.setX(x);
//        location.setY(y);
//        return  location;
//    }
}
