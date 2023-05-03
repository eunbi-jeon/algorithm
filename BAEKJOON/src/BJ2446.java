import java.util.Scanner;

public class BJ2446 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.close();

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*count-1)-(2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count-1; i++) {
            for (int j = 1; j < (count-1)-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 3+(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }//end of main

}