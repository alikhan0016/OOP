package Task3Package;
import java.lang.String;
interface A{
    int findB();
        }
interface C{
    String isZero();
}
interface B{
    int even();
}
class D implements A,B,C{
private int a;
private int c;
D(int a, int c){
    this.a=a;
    this.c=c;
}
public int findB(){
   int b=a-c;
   return b;
}
public String isZero(){
    if(a==0){
        return "Yes";
    }
    return null;
}
public int even(){
    for(int i=0; i<c; i++){
        if(c%2==0){
            return 0;
        }
    }
    return 1;
}
}
abstract class  Shapes2{
    abstract double findSurfaceArea();
    abstract double findVolume();
    abstract String get2DFigure();
}
class Cylinder2 extends Shapes2 {
    private double radius;
    private double length;

    Cylinder2(double radius, double length) {
        this.radius = radius;
        this.length = length;
    }

    double findSurfaceArea() {
        double area = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius + length;
        return area;
    }

    double findVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * length;
        return volume;
    }

    String get2DFigure() {
        return "From front 2D Shape is a Rectangle \nFrom above 2D Shape is a Circle";
    }
}



