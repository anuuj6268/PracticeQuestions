package com.mycompany.shapemanagement;

public class Rectangle {
private double length;
private double breadth;
public Rectangle(double l,double b){
    length = l;
    breadth = b;
}
public double getRectangleArea(){
    return length*breadth;
}
public double getRectanglePerimeter(){
   return 2*(length+breadth);
}
public void setRectangleLength(double l){
    length = l;
}
public void setRectangleBreadth(double b){
    breadth = b;
}
}
