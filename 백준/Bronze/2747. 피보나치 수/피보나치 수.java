import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int FIBONACCI = 1, TEMP = 0;
        for(int i = 1 ; i < N ; i++){
            FIBONACCI = FIBONACCI + TEMP;
            TEMP = FIBONACCI - TEMP;
        }
        System.out.println(FIBONACCI);
    }
}
