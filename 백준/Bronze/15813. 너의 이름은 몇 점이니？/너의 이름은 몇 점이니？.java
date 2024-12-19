import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int alphabetPoint[] = new int[26];
        for (int i = 0; i < alphabetPoint.length; i++)
            alphabetPoint[i] = i + 'A';

        int nameLength = Integer.parseInt(br.readLine());
        String name = br.readLine();
        int point = 0;
        for (int i = 0; i < nameLength; i++) {
            point += (name.charAt(i) - 64);
        }
        System.out.println(point);
    }
}