import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //수의 개수
        int M = Integer.parseInt(st.nextToken()); //나눌 수

        //입력받은 수를 가지고 구분합배열구하기
        long S[] = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1 ; i <= N ; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        long answer = 0;
        long C[] = new long[M];
        int remainder = 0;
        for(int i = 1; i <= N; i++){
            remainder = ((int)(S[i] % M)); //M으로 나눈 나머지값
            if(remainder == 0) answer++; //나머지값이 0이면 정답에 1씩 증가
            C[remainder]++; //나머지가 0인 수와 0이 아닌 수를 카운트 해서 저장
        }

        //저장한 C배열을 꺼내 각각 콤비네이션 계산 후 정답에 1씩 증가
        for(int i = 0 ; i < M; i++){
            answer += C[i] * (C[i] - 1) / 2;
        }

        System.out.println(answer);
        br.close();
    }
}
