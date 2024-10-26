import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N[] = new int[30];
        int A;
        for(int i = 0; i < 28; i++){
            A = Integer.parseInt(br.readLine());
            N[A - 1] = A;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N.length ; i++){
            if(N[i] == 0) sb.append(i + 1).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}