import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();

        String A;
        for(int i = 0 ; i < S.length() ; i++){
            A = String.valueOf(S.charAt(i));
            if(A.equals(A.toLowerCase())) sb.append(A.toUpperCase());
            else sb.append(A.toLowerCase());
        }

        System.out.println(sb.toString());
    }
}
