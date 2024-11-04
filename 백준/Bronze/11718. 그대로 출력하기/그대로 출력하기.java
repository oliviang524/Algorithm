import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        while((S = br.readLine()) != null) System.out.println(S);
        br.close();
    }
}