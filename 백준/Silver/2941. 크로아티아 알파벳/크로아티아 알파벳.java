import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String croatiaAlphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0 ; i < croatiaAlphabet.length ; i++){
            if(S.contains(croatiaAlphabet[i])) S = S.replaceAll(croatiaAlphabet[i], "*");
        }
        System.out.println(S.length());
        br.close();
    }
}