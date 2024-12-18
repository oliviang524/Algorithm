import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String MBTI[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MBTI.length; i++) {
            switch (MBTI[i]) {
                case "E":
                    sb.append("I");
                    break;
                case "I":
                    sb.append("E");
                    break;
                case "S":
                    sb.append("N");
                    break;
                case "N":
                    sb.append("S");
                    break;
                case "F":
                    sb.append("T");
                    break;
                case "T":
                    sb.append("F");
                    break;
                case "J":
                    sb.append("P");
                    break;
                case "P":
                    sb.append("J");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}