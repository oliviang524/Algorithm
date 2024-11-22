import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int A[] = new int[K];
        int B, size = 0;
        for(int i = 0 ; i < K ; i++){
            B = Integer.parseInt(br.readLine());
            if(B == 0){
                if(i == 0) A[size] = 0;
                else {
                    A[size - 1] = 0;
                    size--;
                }
            }else{
                A[size] = B;
                size++;
            }
        }

        int sum = 0;
        for(int i = 0 ; i < A.length ; i++) sum += A[i];
        System.out.println(sum);
    }
}