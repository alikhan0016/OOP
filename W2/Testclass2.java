import java.lang.Math;
abstract class  Shapes2{
    abstract double findSurfaceArea();
    abstract double findVolume();
    abstract String get2DFigure();
}
class Cylinder2 extends Shapes2{
    private double radius;
    private double length;
    Cylinder2(double radius,double length){
        this.radius = radius;
        this.length = length;
    }
    double findSurfaceArea(){
        double area = 2*Math.PI * Math.pow(radius,2) + 2 * Math.PI * radius + length;
        return area;
    }
    double findVolume(){
        double volume = Math.PI * Math.pow(radius,2) * length;
        return volume;
    }
    String get2DFigure(){
        return "From front 2D Shape is a Rectangle \nFrom above 2D Shape is a Circle";
    }

}
class Sphere2 extends Shapes2{
    private double radius;
    Sphere2(double radius){
        this.radius = radius;
    }
    double findSurfaceArea(){
        double area = 4 * Math.PI * Math.pow(radius,2);
        return area;
    }
    double findVolume(){
        double volume = 4.0/3.0 * Math.PI * Math.pow(radius,3);
        return volume;
    }
    String get2DFigure(){
        return "2D Figure of Sphere is a Circle";
    }
}
class Cube2 extends Shapes2{
    private double length;
    Cube2(double length){
        this.length = length;
    }
    double findSurfaceArea(){
        double area = 6*Math.pow(length,2);
        return area;
    }
    double findVolume(){
        double volume = Math.pow(length,3);
        return volume;
    }
    String get2DFigure(){

        return "2D Figure of Cube is a Square";
    }
}
 class Point2 extends Shapes2{
    private double x;
    private double y;
    Point2(double x, double y){
        this.x=x;
        this.y=y;
    }
    double findSurfaceArea(){
        return 0;
    }
    double findVolume(){
        return 0;
    }
    String get2DFigure(){
        return "no 2d figure";
    }
}
public class Testclass2{
    public static void main(String[] args){
        Cylinder2 cylinder = new Cylinder2(5,2);
        Sphere2 sphere = new Sphere2(1);
        Cube2 cube = new Cube2(2);
        Point2 point = new Point2(1,1);
        System.out.println(cylinder.findSurfaceArea());
        System.out.println(cylinder.findVolume());
        System.out.println( cylinder.get2DFigure());
        System.out.println(sphere.findSurfaceArea());
        System.out.println( sphere.findVolume());
        System.out.println( sphere.get2DFigure());
        System.out.println( cube.findSurfaceArea());
        System.out.println( cube.findVolume());
        System.out.println( cube.get2DFigure());
        System.out.println(point.findSurfaceArea());
        System.out.println(point.findVolume());
        System.out.println(point.get2DFigure());
    }
}