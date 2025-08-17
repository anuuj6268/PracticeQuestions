package com.mycompany.shapemanagement;

public class Square {
private double side;
public Square(double s){
    side = s;

}
public double getSquareArea(){
    return side*side;
}
public double getSquarePerimeter(){
    return 4*side;
} 
public void setSquareSide(double s){
    side = s;
}
}
