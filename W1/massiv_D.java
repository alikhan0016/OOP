import java.util.Scanner;

public class massiv_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int a[] = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();

        }
        for(int i=0; i<n-1; i++){
            if(a[i]<a[i+1]){
            k++;
            }

        }
        System.out.println(k);
    }
}