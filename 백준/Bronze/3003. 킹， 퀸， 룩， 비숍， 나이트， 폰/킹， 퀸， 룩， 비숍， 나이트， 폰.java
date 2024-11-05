import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[] = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        StringBuilder sb = new StringBuilder();
        int N;
        for(int i = 0; i < A.length ; i++){
            N = Integer.parseInt(st.nextToken());
            if(A[i] > N) sb.append(A[i] - N).append(" "); 
            else if(A[i] < N) sb.append("-").append(N - A[i]).append(" "); 
            else if(A[i] == N) sb.append(0).append(" "); 
        }
        System.out.print(sb.toString());
    }
}