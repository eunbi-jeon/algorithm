import java.util.Scanner;

class Factorial {

    static int factorial(int n) {
        if(n > 0) return n * factorial(n-1);
		else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        System.out.printf("x의 팩토리얼 값은 %d 입니다.", factorial(n));
    }
}