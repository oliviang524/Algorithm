import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int R;
        String S;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();
            char C[] = S.toCharArray();
            String A = "";
            for(int j = 0; j < C.length ; j++){
                for(int k = 0 ; k < R ; k++) A += C[j];
            }
            sb.append(A).append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}