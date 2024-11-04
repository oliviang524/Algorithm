import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        StringBuilder sb = new StringBuilder();
        while((S = br.readLine()) != null) sb.append(S).append("\n");
        System.out.print(sb.toString());
        br.close();
    }
}