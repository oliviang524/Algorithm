import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jaehwan = br.readLine().length();
        int doctor = br.readLine().length();

        System.out.println(jaehwan < doctor ? "no" : "go");
    }
}