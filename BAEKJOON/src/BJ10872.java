import java.util.Scanner;

public class BJ10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        if(N <= 1) {
            System.out.println(1);
        } else {
            for (int i = N-1; i > 1 ; i--) {
                N *= i;
            }
            System.out.println(N);
        }
    }
}
