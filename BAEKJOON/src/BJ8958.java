import java.util.Scanner;

public class BJ8958 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[sc.nextInt()];

        for(int i = 0; i<arr.length ; i++) {
            arr[i] = sc.next();
        }

        int score = 0; //1점씩 증가하는 점수
        int sum = 0; //점수 합계

        for(int i = 0; i<arr.length ; i++) {
            score = 0;
            sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    score++;
                }
                else {
                    score = 0;
                }
                sum += score;
            }
            System.out.println(sum);
        }

    }//end of main
}//end of class