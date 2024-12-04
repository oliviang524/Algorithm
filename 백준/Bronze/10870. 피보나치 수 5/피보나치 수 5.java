import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = fibonacci(Integer.parseInt(br.readLine()));
        System.out.println(N);
    }

    public static int fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    } 
}