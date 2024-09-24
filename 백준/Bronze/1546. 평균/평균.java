import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sum = 0;
        long max = 0;

        for(int i = 0; i < N ; i++){
            int point = sc.nextInt();
            sum += point;
            if(point > max) max = point;
        }

        System.out.println(sum * 100.0 / max / N);

        sc.close();

    }
}
