import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A[] = new int[26];

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for(int i = 0 ; i < N ; i++){
            if(S.charAt(i) == ',' || S.charAt(i) == ' ' || S.charAt(i) == '.') continue;
            A[S.charAt(i) - 97] = A[S.charAt(i) - 97] + 1;
        }

        int temp = 0;
        for(int i = 0 ; i < A.length ; i++){
            temp = A[i] > temp ? A[i] : temp;
        }
        System.out.println(temp);
    }
}