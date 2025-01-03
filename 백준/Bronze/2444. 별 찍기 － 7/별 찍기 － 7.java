import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int S = 0;
        for(int i = 1 ; i <= N ; i++){
            S = (2 * i) - 1;
            for(int j = 1 ; j <= (N - i) ; j++) sb.append(" ");
            for(int j = 1 ; j <= S ; j++) sb.append("*");
            sb.append("\n");
        }
        for(int i = (N - 1) ; i >= 1 ; i--){
            S = (2 * i) - 1;
            for(int j = 1 ; j <= (N - i); j++) sb.append(" ");
            for(int j = 1 ; j <= S ; j++) sb.append("*");
            sb.append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}