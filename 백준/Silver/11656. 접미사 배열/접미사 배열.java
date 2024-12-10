import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String A[] = new String[S.length()];

        for(int i = 0 ; i < S.length() ; i++){
            A[i] = S.substring(i, S.length());
        }

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < A.length ; i++){
            sb.append(A[i]).append("\n");
        }

        System.out.print(sb.toString());

    }
}