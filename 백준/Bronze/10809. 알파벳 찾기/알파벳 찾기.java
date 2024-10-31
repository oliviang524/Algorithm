import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char alphabet = 'a';
        char A[] = new char[26];

        int B[] = new int[26];

        for(int i = 0 ; i < A.length ; i++){
            A[i] = alphabet++;
            B[i] = -1;
            for(int j = 0 ; j < S.length() ; j++){
                if(A[i] == S.charAt(j) && B[i] == -1){
                    B[i] = j;
                }
            }
        }

        for(int i = 0 ; i < B.length ; i++){
            System.out.print(B[i] + " ");
        }

        br.close();
    }
}