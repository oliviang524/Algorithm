import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jaehwan = br.readLine();
        String doctor = br.readLine();

        if (doctor.length() > jaehwan.length())
            System.out.print("no");
        else
            System.out.print("go");
    }
}