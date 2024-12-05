import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S[] = br.readLine().split(" ");

        int sum = 0;
        int a;
        for (int i = 0; i < S.length; i++) {
            a = Integer.parseInt(S[i]);
            sum += (a * a);
        }

        System.out.print(sum % 10);
    }
}