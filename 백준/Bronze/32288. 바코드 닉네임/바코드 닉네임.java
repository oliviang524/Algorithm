import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (S[i].toLowerCase().equals(S[i]))
                S[i] = S[i].toUpperCase();
            else if (S[i].toUpperCase().equals(S[i]))
                S[i] = S[i].toLowerCase();
            sb.append(S[i]);
        }
        System.out.println(sb.toString());
    }
}