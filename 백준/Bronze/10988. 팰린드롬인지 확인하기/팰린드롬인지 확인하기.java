import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = (br.readLine()).toLowerCase();
        int start = 0, end = S.length() - 1;
        int A = 1;
        while(start <= end){
            if(S.charAt(start) != S.charAt(end)){
                A = 0; break;
            }
            start++; end--;
        }
        System.out.println(A);
        br.close();
    }
}