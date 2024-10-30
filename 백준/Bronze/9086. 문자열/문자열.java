import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String S;
        for(int i = 0 ; i < T ; i++){
           st = new StringTokenizer(br.readLine());
            S = st.nextToken();
            S.charAt(0);
            sb.append(S.charAt(0)).append(S.charAt(S.length() - 1)).append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}