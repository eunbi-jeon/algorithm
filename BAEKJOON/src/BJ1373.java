import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1373 {

    //2진수 -> 8진수로 변환

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();

        //세자리씩 끊어서 계산 - 나머지가 한 자리만 남았을 경우
        if(n.length() % 3 == 1)
            sb.append(n.charAt(0));

        //나머지가 두 자리만 남았을 경우
        if(n.length() % 3 == 2)
            //문자 0의 아스키코드값은 48이므로 숫자 1을 만들기 위해 그 둘을 빼준다.
            sb.append((n.charAt(0)-'0') * 2 + (n.charAt(1)-'0'));

        //그 외의 경우 반복문을 돌며 3자리씩 끊어 계산
        for(int i = n.length() % 3; i < n.length(); i+=3) {
            sb.append((n.charAt(i)-'0') * 4 + (n.charAt(i+1)-'0') * 2
                    + (n.charAt(i+2)-'0'));
        }
        System.out.println(sb);
    }
}
