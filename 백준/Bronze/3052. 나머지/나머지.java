import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A;
        int B = 42;
        int C[] = new int[10];
        for(int i = 0; i < 10; i++){
            A = Integer.parseInt(br.readLine());
            C[i] = A % B;
        }

        Arrays.sort(C);

        int count = 0;
        for(int i = 0; i < C.length; i++){
            if(i == 0) count++;
            else if(C[i - 1] == C[i]) continue;
            else count++;
        }

        System.out.print(count);
        br.close();
    }
}