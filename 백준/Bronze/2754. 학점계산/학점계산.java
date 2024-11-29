import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String C = br.readLine();

        double score[] = {4.0, 3.0, 2.0, 1.0};
        double avg = 0.0;

        for(int i = 0 ; i < score.length ; i++){
            if(C.charAt(0) == 'F') break;
            avg = score[C.charAt(0) - 65];
            if(C.charAt(1) == '+') avg += 0.3;
            else if(C.charAt(1) == '-') avg -= 0.3;
        }
        
        System.out.println(avg);
    }
}