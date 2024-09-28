import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        
        //투포인터인덱스 : 2n이지만 시간 복잡도에서 상수는 제외하기 때문에 결국 n이다.
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1; //startIndex와 endIndex가 둘 다 1에서 시작하기 때문에 sum 또한 1에서 시작
        int count = 1; //자기 자신 하나로 이루어진 경우의 수 미리 저장 (ex - N이 15면 15를 한번 미리 저장 해두는 것)
        while(endIndex != N){
            if(sum == N){
                endIndex++;
                sum += endIndex;
                count++;
            }else if(sum > N){
                sum -= startIndex;
                startIndex++;
            }else{
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(count);
        br.close();
    }
}
