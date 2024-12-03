import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String S[] = new String[T];
        StringBuilder sb = new StringBuilder();
        String A;
        for (int i = 0; i < T; i++) {
            A = br.readLine();
            S = A.split(" ");
            for (int j = 0; j < S.length; j++) {
                int index = S[j].length();
                if (S[j].length() == 1)
                    sb.append(S[j]).append(" ");
                else {
                    while (index > 0) {
                        sb.append(S[j].charAt(index - 1));
                        index--;
                    }
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}