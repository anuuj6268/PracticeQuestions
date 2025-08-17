package com.mycompany.shapemanagement;

public class Cuboid {
private double length;
private double width;
private double height;
public Cuboid(double l,double w,double h){
    width = w;
    height = h;
    length = l;
}
public double getCuboidArea(){
    return 2*((length*width)+(width*height)+(height*length));
}
public double getCuboidVolume(){
    return length*width*height;
}
public void setCuboidLength(double l){
    length = l;
}
public void setCuboidWidth(double w){
    width = w;
}
public void setCuboidHeight(double h){
    height = h;
}
}