import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        int A = S == "" ? 0 : S.split(" ").length;
        System.out.println(A);
        br.close();
    }
}