import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int length = 1;
        for(int i = 0 ; i < N.length() ; i++){
            sb.append(N.charAt(i));
            if(length == 10){
                sb.append("\n");
                length = 1;
            }else{
                length++;
            }
        }

        System.out.print(sb.toString());
    }
}