import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S[] = br.readLine().split(" ");

        String A[] = new String[Integer.parseInt(S[0])];
        String answer = "";
        for (int i = 0; i < A.length; i++) {
            A[i] = br.readLine();
            if (S[1].equals(A[i].split(" ")[0])) {
                answer += A[i].split(" ")[1];
            }
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (S[1].equals(A[i].split(" ")[0]))
                break;
            if (answer.equals(A[i].split(" ")[1]))
                count++;
        }
        System.out.println(count);
    }
}