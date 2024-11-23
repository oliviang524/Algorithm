import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int C = Integer.parseInt(br.readLine());
        
        int N;
        double sum, score, count, avg, S;
        for(int i = 0 ; i < C ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            sum = 0;
            double scores[] = new double[N];
            for(int j = 0 ; j < N ; j++){
                score = Double.parseDouble(st.nextToken());
                scores[j] = score;
                sum += score;
            }
            avg = sum / N;
            count = 0;
            for(int j = 0 ; j < scores.length ; j++){
                if(scores[j] > avg) count++;
            }
            S = (count / N) * 100.0;
            sb.append(String.format("%.3f", S)).append("%").append("\n");
        }

        System.out.print(sb.toString());

        br.close();
    }
}