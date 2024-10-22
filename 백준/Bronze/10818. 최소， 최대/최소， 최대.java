import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        int max = 0;
        int min = 0;
        for(int i = 0; i < N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
            if(i == 0){
                max = A[i];
                min = A[i];
            }else{
                if(min > A[i]) min = A[i];
                if(max < A[i]) max = A[i];
            }
        }
        System.out.println(min + " " + max);
        br.close();
    }
}