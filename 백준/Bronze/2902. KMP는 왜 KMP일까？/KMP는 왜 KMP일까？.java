import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S[] = br.readLine().split("-");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < S.length ; i++){
            sb.append(S[i].charAt(0));
        }
        System.out.println(sb.toString());

    }
}