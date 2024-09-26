import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //표의 크기
        int M = Integer.parseInt(st.nextToken()); //질의 갯수

        StringBuilder output = new StringBuilder();

        //배열 저장하기
        int originArr[][] = new int[N+1][N+1];
        for(int i = 1 ; i <= N ; i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= N ; j++){
                originArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //구간합 만들기
        int newArr[][] = new int[N+1][N+1];
        for(int i = 1 ; i <= N ;i++){
            for(int j = 1; j <= N ; j++){
                newArr[i][j] = newArr[i-1][j] + newArr[i][j-1] - newArr[i-1][j-1] + originArr[i][j];
            }
        }      

        //질의에 답변하기
        output = new StringBuilder();
        for(int i = 0; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            output.append(newArr[x2][y2] - newArr[x1 - 1][y2] - newArr[x2][y1-1] + newArr[x1 - 1][y1 - 1] + "\n");
        }
        System.out.println(output.toString());
    }
}
