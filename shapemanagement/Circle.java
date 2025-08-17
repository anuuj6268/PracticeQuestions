
package com.mycompany.shapemanagement;

public class Circle {
private double radius;


public Circle(double r){
    radius = r;   
}

public double getCircleArea(){
    return 3.14*radius*radius;
            }
public double getCircleCircumference(){
    return 2*3.14*radius;
}
public void setCircleRadius(double r){
    radius =r;
}

}
