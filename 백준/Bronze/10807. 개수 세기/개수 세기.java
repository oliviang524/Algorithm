import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(br.readLine());
        
        int count = 0;
        int array[] = new int[N];
        for(int i = 0; i < N ; i++){
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i] == v) count++;
        }

        System.out.println(count);
        br.close(); //InputStream을 닫음
    }
}