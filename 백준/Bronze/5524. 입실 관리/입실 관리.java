import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Si = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < Si ; i++){
            sb.append(br.readLine().toLowerCase()).append("\n");
        }
        System.out.print(sb.toString());

    }
}