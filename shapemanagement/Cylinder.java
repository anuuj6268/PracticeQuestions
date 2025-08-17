package com.mycompany.shapemanagement;

public class Cylinder {
private double radius;
private double height;
public Cylinder(double r,double h){
    radius = r;
    height = h;
}
public double getCylinderVolume(){
    return 3.14*radius*radius*height;
}
public double getCylinderArea(){
    return (2*3.14*radius*height)+(2*3.14*radius*radius);
}
public void setCylinderRadius(double r){
    radius = r;
}
public void setCylinderHeight(double h){
    height = h;
}
}
