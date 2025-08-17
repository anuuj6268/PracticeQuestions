package com.mycompany.shapemanagement;
public class SemiCircle {
private double radius;
public SemiCircle(double r){
    radius = r;
}
public double getSemiCircleArea(){
    return (3.14*radius*radius)/2;
}
public double getSemiCirclePerimeter(){
    return (3.14*radius)+(2*radius);    
}
public void setSemiCircleRadius(double r){
 radius = r;   
}
}
