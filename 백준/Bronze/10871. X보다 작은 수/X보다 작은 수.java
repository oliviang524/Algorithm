import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int A[] = new int[N];
        for(int i = 0; i < N ; i++){
            A[i] = Integer.parseInt(st2.nextToken());
            if(X > A[i]) bw.write(A[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close(); //InputStream을 닫음
    }
}