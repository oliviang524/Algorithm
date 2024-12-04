import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 5;
        int sum = 0;
        int point = 0;
        for (int i = 0; i < N; i++) {
            point = Integer.parseInt(br.readLine());
            if (point < 40) sum += 40;
            else sum += point;
        }

        System.out.println(sum / N);
    }
}
