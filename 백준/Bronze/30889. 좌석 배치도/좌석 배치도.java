import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char seats[][] = new char[10][20];
        int N = Integer.parseInt(br.readLine());
        String SEAT;
        for (int i = 0; i < N; i++) {
            SEAT = br.readLine();
            seats[SEAT.charAt(0) - 64 - 1][Integer.parseInt(SEAT.substring(1, SEAT.length())) - 1] = 'o';
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (seats[i][j] == 'o') sb.append("o");
                else sb.append(".");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}