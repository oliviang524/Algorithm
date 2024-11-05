import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[] = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A.length ; i++) sb.append(A[i] - Integer.parseInt(st.nextToken())).append(" ");
        System.out.println(sb.toString());
        br.close();
    }
}