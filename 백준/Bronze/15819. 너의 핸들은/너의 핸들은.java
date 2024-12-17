import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken()) - 1;

        String S[] = new String[N];
        for (int i = 0; i < N; i++) S[i] = br.readLine();

        Arrays.sort(S);

        for (int i = 0; i < S.length; i++) {
            if (i == I) System.out.println(S[i]);
        }
    }
}