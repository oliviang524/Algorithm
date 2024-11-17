import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        int A[] = new int[N];
        for(int i = 0 ; i < N ; i++) A[i] = Integer.parseInt(br.readLine());

        int temp;
        for(int i = 0 ; i < N - 1; i++) {
            for(int j = 0 ; j < (N  - 1 - i); j++){
                if(A[j] > A[j + 1]){
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ; i < N ; i++) sb.append(A[i]).append("\n");
        System.out.print(sb.toString());
        br.close();
    }
}