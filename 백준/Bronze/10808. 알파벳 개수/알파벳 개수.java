import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int A[] = new int[26];

        char C;
        for(int i = 0 ; i < S.length() ; i++){
            C = S.charAt(i);
            A[C - 97]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < A.length ; i++){
            sb.append(A[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}