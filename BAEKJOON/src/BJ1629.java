import java.util.Scanner;

public class BJ1629 {

    public static long C;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        C = sc.nextLong();
        sc.close();

        System.out.println(pow(A,B));
    }

    //A^B
    public static long pow(long A, long B) {

        //A^1 일 경우 A / C를 하여 return
        if(B == 1) {
            return A % C;
        }

        //분할 정복 -> B/2를 하여 A에 거듭제곱
        long temp = pow(A, B/2);

        /*
            만약 B의 값이 홀수라면
            A^(B/2) * A^(B/2) * A 이므로
            A를 한번 더 곱해줌
         */

        if(B % 2 == 1) {
            //temp * temp * A가 long 범위를 넘어갈 수도 있기 때문에
            //모듈러 공식을 적용 (a * b) % C = (a % C * b % C) % C
            //(temp * temp * A) % C = ((temp * temp % C) * (A % C)) % C
            //                      = (((temp * temp % C) % C) * (A % C)) % C
            //                      = ((temp * temp % C) * A) % C
            return (temp * temp % C) * A % C;
        }

        return temp * temp % C;
    }
}
