import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S;
        StringBuilder sb = new StringBuilder();
        while ((S = br.readLine()) != null) {
            if (S.equals("END")) break;
            for (int i = (S.length() - 1); i >= 0; i--) {
                sb.append(S.charAt(i));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}