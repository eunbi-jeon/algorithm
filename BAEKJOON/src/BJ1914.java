import java.math.BigInteger;
import java.util.Scanner;

public class BJ1914 {

    static StringBuilder sb = new StringBuilder();

    public static void hanoi(int count, int from, int by, int to) {
        //원판의 이동횟수는 2^-1
        if(count == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            hanoi(count - 1, from, to, by);
            sb.append(from + " " + to + "\n");
            hanoi(count-1, by, from, to);
        }
    }

    //하노이의 탑
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        //long이 최대 2^64-1 이기 때문에 범위 초과로 BigInteger 사용
        BigInteger res = new BigInteger("1");

        if(N <= 20) {
            hanoi(N, 1, 2, 3);
            sb.insert(0, (int)(Math.pow(2, N) -1) + "\n");
            System.out.print(sb);
        } else { //20을 초과했을 때는 이동횟수만 출력
            for(int i = 0 ; i < N ; ++i) {
                //2의 N제곱
                res = res.multiply(new BigInteger("2"));
            }
            res = res.subtract(new BigInteger("1")); //-1
            System.out.println(res);
        }
    }
}
