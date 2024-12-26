import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int N = Integer.parseInt(br.readLine());

        String code;
        int count = 0;
        for (int i = 0; i < N; i++) {
            code = br.readLine();
            if (S.substring(0, 5).equals(code.substring(0, 5)))
                count++;
        }
        System.out.println(count);
    }
}