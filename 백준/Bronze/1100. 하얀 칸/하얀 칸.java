import java.io.*;

public class Main {
    private static final int N = 8;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int white = 0;
        String S;
        for(int i = 0 ; i < N ; i++){
            S = br.readLine();
            for(int j = i % 2 ; j < N ; j+=2){
                if(S.charAt(j) == 'F') white++;
            }
        }

        System.out.println(white);
    }
}