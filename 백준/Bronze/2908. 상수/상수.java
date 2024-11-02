import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();
        String S1 = "", S2 = "";
        for(int i = 3; i > 0 ; i--){
            S1 += A.charAt(i - 1);
            S2 += B.charAt(i - 1);
        }
        String answer = Integer.parseInt(S1) > Integer.parseInt(S2) ? S1 : S2;
        System.out.print(answer);
        br.close();
    }
}