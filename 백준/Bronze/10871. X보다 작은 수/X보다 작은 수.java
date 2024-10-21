import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N ; i++){
            int A = Integer.parseInt(st.nextToken());
            if(X > A) sb.append(A).append(" ");
        }
        System.out.println(sb.toString());
        br.close(); //InputStream을 닫음
    }
}