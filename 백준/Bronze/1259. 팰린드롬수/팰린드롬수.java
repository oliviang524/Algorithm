import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S;
        int end = -1;
        StringBuilder sb = new StringBuilder();

        while((S = br.readLine()) != null){
            end = S.length() - 1;

            if(S.charAt(0) == '0') break;

            boolean A = true;

            for(int i = 0 ; i < S.length() ; i++){
                if(S.charAt(i) != S.charAt(end)) {
                    A = false; break;
                }
                end--;
            }

            if(A) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}