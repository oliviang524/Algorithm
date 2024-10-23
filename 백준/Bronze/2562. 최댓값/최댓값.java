import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[9];
        int max = 0;
        int index = 0;
        for(int i = 0; i < A.length ; i++){
            A[i] = Integer.parseInt(br.readLine());
            if(max < A[i]){
                max = A[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
        br.close();
    }
}