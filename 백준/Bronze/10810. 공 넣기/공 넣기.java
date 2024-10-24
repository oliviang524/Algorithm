import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //바구니 갯수
        int M = Integer.parseInt(st.nextToken()); //바구니에 공을 넣는 횟수

        int A[] = new int[N]; //5개의 바구니
        int I, J, K;
        for(int i = 0; i < M ; i++){ //
            st = new StringTokenizer(br.readLine(), " ");
            I = Integer.parseInt(st.nextToken());
            J = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            for(int j = I ; j <= J ; j++) A[j - 1] = K;
        }

        for(int i = 0 ; i < A.length ; i++) System.out.print(A[i] + " ");
        br.close();
    }
}