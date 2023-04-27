import java.util.Scanner;

public class BJ4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt(); //테스트 횟수

        int[] arr;

        for(int i = 0; i<test ; i++) { //테스트 횟수만큼 반복

            int stu = sc.nextInt(); //학생 수
            arr = new int[stu];

            double sum = 0; //누적점수

            //배열에 값넣기
            for(int j = 0 ; j<stu ; j++) {
                int score = sc.nextInt();
                arr[j]=score;
                sum += score;
            }

            double avg = sum/stu; //평균점수
            double count = 0; //평균을 넘는 학생

            //평균넘는 학생 확인
            for(int j = 0; j<stu; j++) {
                if(arr[j]>avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/stu)*100);

        }

        sc.close();

    }//end of main
}//end of class