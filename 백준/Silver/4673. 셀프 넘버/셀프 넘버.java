import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int limit = 10001;
        boolean B[] = new boolean[limit];

        for(int i = 1 ; i < limit ; i++){
            int n = d(i);
            if(n < limit) B[n] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < limit ; i++){
            if(!B[i]) sb.append(i).append("\n");
        }

        System.out.print(sb.toString());
    }

    public static int d(int num){
        int sum = num;
        
        while(num != 0){
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }
}