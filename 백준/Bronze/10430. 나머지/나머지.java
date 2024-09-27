import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int C1 = (A + B) % C;
        int C2 = ((A % C) + (B % C)) % C;
        int C3 = (A * B) % C;
        int C4 = ((A % C) * (B % C)) % C;
        
        StringBuilder output = new StringBuilder();
        output.append(C1).append("\n").append(C2).append("\n").append(C3).append("\n").append(C4).append("\n");

        System.out.println(output);

        br.close();
    }
}
