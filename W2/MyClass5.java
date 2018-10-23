package Fifthtask;

public class MyClass5 {
    static class MinAndMax{
        public static int min;
        public static int max;

        public static String printminmax(){
            return min + " " + max;
        }
    }
    static String minmax(int a[]){
        int min = a[0];
        int max = a[0];
        for(int i = 1;i<a.length;i++){
            if(min>a[i]) min = a[i];
            if(max<a[i]) max = a[i];
        }
        MinAndMax.min = min;
        MinAndMax.max = max;
        return MinAndMax.printminmax();
    }
}

class Main {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(MyClass5.minmax(a));
    }
}