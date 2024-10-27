import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = 42;
        boolean B[] = new boolean[A];
        for(int i = 0; i < 10; i++)
            B[(Integer.parseInt(br.readLine())) % A] = true;

        int count = 0;
        for(int i = 0; i < B.length; i++)
            if(B[i]) count++;

        System.out.print(count);
        br.close();
    }
}
