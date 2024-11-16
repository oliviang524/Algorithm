import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = 1;
        for(int i = 0 ; i < 3 ; i++) N *= Integer.parseInt(br.readLine());

        int A[] = new int[10];
        String S = String.valueOf(N);        
        for(int i = 0 ; i < S.length() ; i++){
            for(int j = 0 ; j < A.length ; j++){
                if(String.valueOf(S.charAt(i)).equals(String.valueOf(j))) A[j]++;
            }
        }
        
        for(int i = 0 ; i < A.length ; i++) sb.append(A[i]).append("\n");
        System.out.print(sb);

        br.close();
    }
}