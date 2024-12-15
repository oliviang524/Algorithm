import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S[] = br.readLine().split("");
        int T = Integer.parseInt(br.readLine());

        String idxs[] = new String[T];
        int A, B;
        String temp;
        for (int i = 0; i < T; i++) {
            idxs = br.readLine().split(" ");
            A = Integer.parseInt(idxs[0]);
            B = Integer.parseInt(idxs[1]);
            temp = S[A];
            S[A] = S[B];
            S[B] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length; i++) {
            sb.append(S[i]);
        }
        System.out.println(sb.toString());
    }
}