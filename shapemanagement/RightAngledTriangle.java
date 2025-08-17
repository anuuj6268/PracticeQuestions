package com.mycompany.shapemanagement;

public class RightAngledTriangle {
    private double perpendicular;
    private double base;
    private double hypotenuse = Math.sqrt((perpendicular*perpendicular)+(base*base));
    
    public RightAngledTriangle(double p,double b){
        perpendicular = p;
        base = b;
    }
    public double getRightAngledTriangleArea(){
        return (base*perpendicular)/2;
    }
    public double getRightAngledTrianglePerimeter(){
        return base+perpendicular+hypotenuse;
    }
    public void setRightAngledTriangleBase(double b){
        base = b;
    }
    public void setRightAngledTrianglePerpendicular(double p){
        perpendicular = p;
    }
    
    
    
}
