import java.util.Scanner;

public class kol_pol_el {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k=0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();

            if (a[i] > 0) {
                k++;

            }
        }
        System.out.println(k);
    }
}