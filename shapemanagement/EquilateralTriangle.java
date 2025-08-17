package com.mycompany.shapemanagement;

public class EquilateralTriangle {

    private double side;

    public EquilateralTriangle(double s) {
        side = s;
    }
    public double getEquilateralTriangleArea(){
        return (Math.sqrt(3)/4)*(side*side);    
    }
    public double getEquilateralTrianglePerimeter(){
        return 3*side;
    }
    public void setEquilateralTriangleSide(double s){
        side = s;
    }

}
