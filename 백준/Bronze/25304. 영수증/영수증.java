import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); //영수증에 적힌 총 금액 
        int N = Integer.parseInt(br.readLine()); //구매한 물건의 종류의 수
        int sum = 0;
        for(int i = 0; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()); //가격
            int b = Integer.parseInt(st.nextToken()); //수량
            sum += (a * b);
        }
        if(X == sum) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
}