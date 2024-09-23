import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < num ; i++) sum += (cNum[i] - 48);

        System.out.println(sum);

    }
}
