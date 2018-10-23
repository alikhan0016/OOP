package Task4Package;

interface Moveable
{
   int findaverage();
int speed=550;
}
interface bbs extends Moveable{
  int speed=45;
}
class CNN implements Moveable,bbs{

public int findaverage() {
       int average=Moveable.speed+bbs.speed;
       return average;
    }
}
public class MyClass4{
    public static void main(String[] args){
        CNN d=new CNN();
        System.out.println(d.findaverage());
    }
}