package com.mycompany.shapemanagement;
public class Cone {
private double height;
private double radius;

public Cone(double h,double r){
    radius = r;
    height = h;
}

public double getConeVolume(){
    return 3.14*radius*radius*(height/3);
}
public double getConeArea(){
    return 3.14*radius*(radius+(Math.sqrt((height*height)+(radius*radius))));
}
public void setConeRadius(double r){
    radius = r;
}
public void setConeHeight(double h){
height = h;
}
}
