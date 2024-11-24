import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        char C[] = new char[N.length()];

        for(int i = 0 ; i < C.length ; i++) C[i] = N.charAt(i);

        char temp;
        for(int i = 0 ; i < C.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(C[i] > C[j]){
                    temp = C[j];
                    C[j] = C[i];
                    C[i] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N.length() ; i++) sb.append(C[i]);

        System.out.print(sb.toString());

        br.close();
    }
}