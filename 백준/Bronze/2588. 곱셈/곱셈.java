import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());

        long c = (b % 10) * a; // 385 % 10 = 5 * 472 = 2,360
        long d = ((b % 100) / 10) * a; // 385 % 100 = 85 / 10 = 8 * 472 = 3,776
        long e = (b / 100) * a; // 385 / 100 = 3 * 472 = 1,416

        StringBuilder output = new StringBuilder();
        output.append(c).append("\n");
        output.append(d).append("\n");
        output.append(e).append("\n");
        output.append(a * b).append("\n");
        System.out.println(output.toString());
        
        br.close();
    } 
}
