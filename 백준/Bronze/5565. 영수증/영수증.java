import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++) {
            price -= Integer.parseInt(br.readLine());
        }

        System.out.println(price);

    }
}