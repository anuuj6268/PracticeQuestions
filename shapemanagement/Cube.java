package com.mycompany.shapemanagement;

public class Cube {
private double side;

public Cube(double s){
    side = s;
    
}
public double getCubeArea(){
    return 6*side*side;
}
public double getCubeVolume(){
    return side*side*side;
}
public void setCubeSide(double s){
    side = s;
}
}

