import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = 9;
        int A[][] = new int[N][N];
        int max = 0, column = 0, row = 0;

        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N ; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                if(A[i][j] > max){
                    max = A[i][j];
                    column = i;
                    row = j;
                }
            }
        }

        sb.append(max).append("\n").append((column + 1)).append(" ").append((row + 1));
        System.out.print(sb.toString());

        br.close();
    }
}