import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S[] = br.readLine().split("");
        String M[] = { "a", "e", "i", "o", "u" };
        int count = 0;
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (S[i].equals(M[j]))
                    count++;
            }
        }
        System.out.println(count);
    }
}