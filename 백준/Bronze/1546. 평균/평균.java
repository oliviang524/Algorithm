import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] point = new int[N];
        for(int i = 0; i < N ; i++) point[i] = sc.nextInt(); 

        long sum = 0;
        long max = 0;
        for(int i = 0; i < N ; i++){
            sum += point[i];
            if(point[i] > max) max = point[i];
        }

        System.out.println(sum * 100.0 / max / N);

        sc.close();

    }
}
