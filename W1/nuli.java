import java.util.Scanner;

public class nuli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 0;

        for (int i = 1; i <= n; ++i) {
            int x = scanner.nextInt();
            if(x==0){
                b++;
            }
        }
        System.out.println(b);
    }

}
