import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int A[] = new int[N];
        for(int i = 0; i < N ; i++) A[i] = i + 1;

        int i, j, temp;
        for(int k = 0 ; k < M ; k++){
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            while(i < j){
                temp = A[j - 1];
                A[j - 1] = A[i - 1];
                A[i - 1] = temp;
                j--;
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < A.length ; k++) sb.append(A[k]).append(" ");
        System.out.println(sb.toString());

        br.close();
    }
}