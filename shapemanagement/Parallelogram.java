
package com.mycompany.shapemanagement;
public class Parallelogram {
private double base;
private double height;
private double side;
public Parallelogram(double s,double b,double h){
    base = b;
    height = h;
    side = s;
}
public double getParallelogramArea(){
    return base*height;
}
public double getParallelogramPerimeter(){
    return 2*(side+base);
}
public void setParallelogramSide(double s){
    side = s;
}
public void setParallelogramBase(double b){
    base = b;
}
public void setParallelogramHeight(double h){
    height = h;
}


}
