import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int first = 0, second = 1, temp;
        for(int i = 1 ; i <= N ; i++){
            temp = second;
            second = first + second;
            first = temp;
        }
        System.out.println(first);
    }
}