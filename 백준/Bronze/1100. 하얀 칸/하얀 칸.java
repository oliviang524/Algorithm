import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 8;
        boolean chessPlate[][] = new boolean[N][N];

        String S;
        for(int i = 0 ; i < N ; i++){
            S = br.readLine();
            for(int j = 0 ; j < S.length() ; j++){
                if(S.charAt(j) == 'F') chessPlate[i][j] = true;
            }
        }

        int white = 0;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(i % 2 != 0 && j % 2 != 0 && chessPlate[i][j]) white++; 
                if(i % 2 == 0 && j % 2 == 0 && chessPlate[i][j]) white++; 
            }
        }

        System.out.println(white);
    }
}