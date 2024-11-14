import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int W = 100;
        int N = Integer.parseInt(br.readLine());

        boolean C[][] = new boolean[W][W];

        int A, B;
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            for(int j = A ; j < (A + 10) ; j++){
                for(int k = B ; k < (B + 10) ; k++){
                    C[j][k] = true;
                }
            }
        }

        int extent = 0;
        for(int j = 1 ; j <= W ; j++){
            for(int k = 1 ; k <= W ; k++){
                if(C[j - 1][k - 1]) extent++;
            }
        }
        System.out.print(extent);

        br.close();
    }
}