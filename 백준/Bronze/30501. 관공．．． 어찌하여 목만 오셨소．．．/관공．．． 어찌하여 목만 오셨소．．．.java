import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S[] = new String[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
            for (int j = 0; j < S[i].length(); j++) {
                if (S[i].charAt(j) == 'S')
                    sb.append(S[i]);
            }
        }
        System.out.println(sb.toString());
    }
}