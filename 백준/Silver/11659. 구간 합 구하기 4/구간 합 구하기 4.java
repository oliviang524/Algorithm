import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner 보다 속도가 빠름
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); //첫번째 줄 읽었다는 뜻
        int numCount = Integer.parseInt(stringTokenizer.nextToken()); //숫자개수
        int questionCount = Integer.parseInt(stringTokenizer.nextToken()); //질의개수

        // int의 범위가 넘어갈 수 있기 때문에 숫자의 단위가 크면 long으로 선언해주는 것이 좋다.
        // 사람 처럼 첫번째 순서가 1번이 되도록 하기 위해 0번째 데이터를 무시하고자 +1을 해준 것
        long[] S = new long[numCount + 1];
        
        // 배열 받아서 합배열 생성
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i<= numCount; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        
        // 합배열을 가지고 구간합 구하기
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < questionCount; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startIdx = Integer.parseInt(stringTokenizer.nextToken());
            int endIdx = Integer.parseInt(stringTokenizer.nextToken());
            output.append(S[endIdx] - S[startIdx - 1]).append("\n");
        }
        System.out.println(output.toString());
    }
}
