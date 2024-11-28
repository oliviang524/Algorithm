import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S;
        while((S = br.readLine()) != null){
            sb.append(S).append("\n");
        }

        System.out.print(sb.toString());
    }
}