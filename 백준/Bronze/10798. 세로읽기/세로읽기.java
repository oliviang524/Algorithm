import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String A[][] = new String[15][15];
        String S;

        for(int i = 0 ; i < 5 ; i++){
            S = br.readLine();
            for(int j = 0 ; j < S.length() ; j++) {
                A[i][j] = String.valueOf(S.charAt(j));
            }
        }

        for(int i = 0 ; i < 15 ; i++){
            for(int j = 0 ; j < 15 ; j++){
                if(A[j][i] != null) sb.append(A[j][i]);
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}