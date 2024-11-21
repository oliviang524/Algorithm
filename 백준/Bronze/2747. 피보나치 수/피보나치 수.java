import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int A[] = new int[N + 1];
        for(int i = 1 ; i <= N ; i++) A[i] = i;

        for(int i = 2 ; i <= N + 1 ; i++){
            if(i > N) break;
            A[i] = (A[i - 1] + A[i - 2]);
        }

        System.out.println(A[A.length - 1]);
    }
}