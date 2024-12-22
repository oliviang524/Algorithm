import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S[] = br.readLine().split(",");
        int sum = 0;
        for (int i = 0; i < S.length; i++) {
            sum += Integer.parseInt(S[i]);
        }
        System.out.println(sum);
    }
}