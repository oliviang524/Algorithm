import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = 5;
        int M = 15;

        String A[][] = new String[N][M];
        String S;

        for(int i = 0 ; i < N ; i++){
            S = br.readLine();
            for(int j = 0 ; j < S.length() ; j++) {
                A[i][j] = String.valueOf(S.charAt(j));
            }
        }

        for(int i = 0 ; i < M ; i++){
            for(int j = 0 ; j < N ; j++){
                if(A[j][i] != null) sb.append(A[j][i]);
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}