import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(X > A[i]) sb.append(A[i]).append(" ");
        }
        System.out.println(sb.toString());
        br.close();
    }
}