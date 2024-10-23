import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N > 0) {
            sb.append(N).append("\n");
            N--;
        }
        System.out.print(sb.toString());
        br.close();
    }
}