package com.mycompany.shapemanagement;

public class ShapeManagement {

    public static void main(String[] args) {
        Cone J = new Cone(12, 9.6);
        System.out.println("Area of cone J: " + J.getConeArea());
        System.out.println("Volume of cone J: " + J.getConeVolume());
        J.setConeHeight(5);
        J.setConeRadius(2.5);
        System.out.println("Area of cone J after update: " + J.getConeArea());
        System.out.println("Volume of cone J after update: " + J.getConeVolume());
        System.out.println("========================================================");

        Circle B = new Circle(6.5);
        System.out.println("Area of Circle B :" + B.getCircleArea());
        System.out.println("Perimeter of Circle B : " + B.getCircleCircumference());
        B.setCircleRadius(5);
        System.out.println("Area of Circle B after update :" + B.getCircleArea());
        System.out.println("Perimeter of Circle B after update: " + B.getCircleCircumference());
        System.out.println("========================================================");

        Circle C = new Circle(5.5);
        System.out.println("Area of Circle C :" + C.getCircleArea());
        System.out.println("Perimeter of Circle C : " + C.getCircleCircumference());
        B.setCircleRadius(4.5);
        System.out.println("Area of Circle C after update :" + C.getCircleArea());
        System.out.println("Perimeter of Circle C after update: " + C.getCircleCircumference());
        System.out.println("========================================================");

        Circle G = new Circle(1.2);
        System.out.println("Area of Circle G:" + G.getCircleArea());
        System.out.println("Perimeter of Circle G : " + G.getCircleCircumference());
        B.setCircleRadius(2);
        System.out.println("Area of Circle G after update :" + G.getCircleArea());
        System.out.println("Perimeter of Circle G after update: " + G.getCircleCircumference());
        System.out.println("========================================================");

        SemiCircle D = new SemiCircle(3.2);
        System.out.println("Area of SemiCircle D : " + D.getSemiCircleArea());
        System.out.println("Volume of SemiCircle D : " + D.getSemiCirclePerimeter());
        D.setSemiCircleRadius(55);
        System.out.println("Area of SemiCircle D after update: " + D.getSemiCircleArea());
        System.out.println("Volume of SemiCircle D after update: " + D.getSemiCirclePerimeter());
        System.out.println("========================================================");

        SemiCircle F = new SemiCircle(8.5);
        System.out.println("Area of SemiCircle F : " + F.getSemiCircleArea());
        System.out.println("Volume of SemiCircle F : " + F.getSemiCirclePerimeter());
        D.setSemiCircleRadius(5);
        System.out.println("Area of SemiCircle F after update: " + F.getSemiCircleArea());
        System.out.println("Volume of SemiCircle F after update: " + F.getSemiCirclePerimeter());
        System.out.println("========================================================");

        Square H = new Square(2);
        System.out.println("Area of Square : " + H.getSquareArea());
        System.out.println("Perimeter of Square : " + H.getSquarePerimeter());
        H.setSquareSide(5);
        System.out.println("Area of Square after update: " + H.getSquareArea());
        System.out.println("Perimeter of Square after update: " + H.getSquarePerimeter());
        System.out.println("========================================================");

        Cube L = new Cube(14);
        System.out.println("Area of Cube : " + L.getCubeArea());
        System.out.println("Volume of Cube : " + L.getCubeVolume());
        L.setCubeSide(5);
        System.out.println("Area of Cube after update: " + L.getCubeArea());
        System.out.println("Volume of Cube after update: " + L.getCubeVolume());
        System.out.println("========================================================");

        Cuboid M = new Cuboid(12, 8, 7);
        System.out.println("Area of Cuboid : " + M.getCuboidArea());
        System.out.println("Volume of Cuboid : " + M.getCuboidVolume());
        M.setCuboidHeight(5);
        M.setCuboidLength(6);
        M.setCuboidWidth(7);
        System.out.println("Area of Cuboid after update: " + M.getCuboidArea());
        System.out.println("Volume of Cuboid after update: " + M.getCuboidVolume());
        System.out.println("========================================================");

        Rectangle A = new Rectangle(8, 5);
        System.out.println("Area Of Rectangle A : " + A.getRectangleArea());
        System.out.println("Perimeter of Rectangle A :" + A.getRectanglePerimeter());
        A.setRectangleBreadth(55);
        A.setRectangleLength(65);
        System.out.println("Area Of Rectangle A after update: " + A.getRectangleArea());
        System.out.println("Perimeter of Rectangle A after update:" + A.getRectanglePerimeter());
        System.out.println("========================================================");

        Rectangle E = new Rectangle(11.6, 9.2);
        System.out.println("Area Of Rectangle E : " + E.getRectangleArea());
        System.out.println("Perimeter of Rectangle E :" + E.getRectanglePerimeter());
        E.setRectangleBreadth(55);
        E.setRectangleLength(65);
        System.out.println("Area Of Rectangle E after update: " + E.getRectangleArea());
        System.out.println("Perimeter of Rectangle E after update:" + E.getRectanglePerimeter());
        System.out.println("========================================================");

        Cylinder I = new Cylinder(9.5, 18.5);
        System.out.println("Area of Cylinder : " + I.getCylinderArea());
        System.out.println("Volume of Cylinder : " + I.getCylinderVolume());
        I.setCylinderHeight(8);
        I.setCylinderRadius(4);
        System.out.println("Area of Cylinder after update: " + I.getCylinderArea());
        System.out.println("Volume of Cylinder after update: " + I.getCylinderVolume());
        System.out.println("========================================================");

        RightAngledTriangle N = new RightAngledTriangle(8, 10);
        System.out.println("Area of RightAngledTriangle : " + N.getRightAngledTriangleArea());
        System.out.println("Perimeter of RightAngledTriangle : " + N.getRightAngledTrianglePerimeter());
        N.setRightAngledTriangleBase(5);
        N.setRightAngledTrianglePerpendicular(2.5);
        System.out.println("Area of RightAngledTriangle after update: " + N.getRightAngledTriangleArea());
        System.out.println("Perimeter of RightAngledTriangle after update: " + N.getRightAngledTrianglePerimeter());
        System.out.println("========================================================");
        
        EquilateralTriangle O = new EquilateralTriangle(7);
        System.out.println("Area of EquilateralTriangle : " + O.getEquilateralTriangleArea());
        System.out.println("Periemter of EquilateralTriangle : " + O.getEquilateralTrianglePerimeter());
        O.setEquilateralTriangleSide(5);
        System.out.println("Area of EquilateralTriangle after update: " + O.getEquilateralTriangleArea());
        System.out.println("Periemter of EquilateralTriangle after update: " + O.getEquilateralTrianglePerimeter());

    }
}
