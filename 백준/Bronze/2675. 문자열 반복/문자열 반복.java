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
            for(int j = 0; j < S.length() ; j++){
                for(int k = 0 ; k < R ; k++) sb.append(S.charAt(j));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}