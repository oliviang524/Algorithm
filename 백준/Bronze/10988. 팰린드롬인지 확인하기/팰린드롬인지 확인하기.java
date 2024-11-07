import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = (br.readLine()).toLowerCase();
        char A[] = new char[S.length()];
        char B[] = new char[S.length()];
        for(int i = 0 ; i < S.length() ; i++){
            A[i] = S.charAt(i);
        }
        for(int i = S.length() - 1 ; i >= 0 ; i--){
            B[(S.length() - 1) - i] = A[i];
        }
        int answer = 0;
        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == B[i]) answer = 1;
            else {
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
        br.close();
    }
}