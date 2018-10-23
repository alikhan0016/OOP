package Task3Package;

public class TestClass3{
    public static void main(String[] args){
        D d=new D(0,1);
        Cylinder2 cylinder2 = new Cylinder2(1,2);
        System.out.println(cylinder2.findSurfaceArea());
        System.out.println(cylinder2.findVolume());
        System.out.println(cylinder2.get2DFigure());
        System.out.println(d.findB());
        System.out.println(d.isZero());
        System.out.println(d.even());
    }
}