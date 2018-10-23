import java.lang.Math;
interface Shapes{
     double findarea();
     double find_volume();
}
class Cylinder implements Shapes{
    private double radius;
    private double length;
    Cylinder(double radius,double length){
        this.radius=radius;
        this.length=length;
    }
    public double findarea(){
        double area=2*Math.PI*Math.pow(radius,2)+2*Math.PI+length;
        return area;
    }
    public double find_volume(){
        double volume=length*Math.PI*Math.pow(radius,2);
return volume;
    }
}
class Sphere implements Shapes{
    private double radius;
    private double length;
    Sphere(double radius,double length){
        this.radius=radius;
        this.length=length;
    }
    public double find_volume() {
        double volume = 4 / 3 * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    public double findarea(){
        double area= 6*88*Math.PI*Math.pow(length,2);
        return area;
    }
 }
class Cube implements Shapes{
    private double radius;
    private double length;
    Cube(double radius,double length){
        this.radius=radius;
        this.length=length;
    }
public double find_volume()
        {
        double volume= 6*Math.pow(length,3);
        return volume;
        }
    public double findarea(){
        double area= 6*8*Math.PI*Math.pow(radius,2);
        return area;
    }
}
 class Point implements Shapes {
    private double x;
    private double y;
    Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double findarea(){
        return 0;
    }
    public double find_volume(){
        return 0;
    }
}
public class MyClass{
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(5,5);
        Sphere sphere = new Sphere(5,9);
        Cube cube = new Cube(2,5);
        Point point = new Point(1,1);
        System.out.println(cylinder.findarea());
        System.out.println(cylinder.find_volume());
        System.out.println(sphere.findarea());
        System.out.println( sphere.find_volume());
        System.out.println( cube.findarea());
        System.out.println( cube.find_volume());
        System.out.println( point.findarea());
        System.out.println( point.find_volume());
    }
}