import java.util.Scanner;

public class kakoe_iz_chisel_bolshe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        if(num>num1){
            System.out.println(1);
        }
        else if(num<num1){
            System.out.println(2);
        }
        else{
            System.out.println(0);

        }
    }
}